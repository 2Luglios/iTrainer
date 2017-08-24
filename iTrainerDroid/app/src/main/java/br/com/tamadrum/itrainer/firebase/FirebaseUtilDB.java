package br.com.tamadrum.itrainer.firebase;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import br.com.tamadrum.itrainer.modelo.Plano;
import br.com.tamadrum.itrainer.modelo.Treino;
import br.com.tamadrum.itrainer.modelo.Usuario;

import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Created by ettoreluglio on 13/08/17.
 */

public class FirebaseUtilDB {

    private final FirebaseDatabase database;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public FirebaseUtilDB() {
        database = FirebaseDatabase.getInstance();
    }

    public void saveOrUpdate(String raiz, FirebaseRTDBInterface modelo) {
        if ( modelo instanceof FirebaseRTDBToken ) {
            ((FirebaseRTDBToken)modelo).setToken(FirebaseInstanceId.getInstance().getToken());
        }
        DatabaseReference ref = database.getReference(raiz).push();
        if ( modelo instanceof FirebaseRTDBModel ) {
            ((FirebaseRTDBModel)modelo).setHash(ref.getKey());
        }
        ref.setValue(modelo);
    }

    public void getUltimoTreino(String raiz, final FirebaseRTDBGetLastDate lastDate) {
        final long[] ultimaData = {0};
        final DatabaseReference myRef = database.getReference(raiz);
        myRef
//                .orderByChild("usuario").equalTo("Ettore")
                .addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                Iterator<DataSnapshot> i = children.iterator();
                while(i.hasNext()) {
                    DataSnapshot next = i.next();

                    Treino treino = (Treino) next.getValue(Treino.class);
                    if ( treino.getDataInicial() > ultimaData[0] ) ultimaData[0] = treino.getDataInicial();

                    Date data = new Date();
                    data.setTime(ultimaData[0]);
                    lastDate.lastDate(sdf.format(data));
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void getCount(String raiz, final FirebaseRTDBGetCount getCount) {
        final DatabaseReference myRef = database.getReference(raiz);
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                getCount.getCount(dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.d("FirebaseDatabase", "Erro ao ler ", error.toException());
            }
        });
    }

    public void readRTDB(String raiz, final Class<? extends FirebaseRTDBModel> clazz,
                         final FirebaseRTDBUpdate updateMensagens) {
        final DatabaseReference myRef = database.getReference(raiz);

        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                Iterator<DataSnapshot> i = children.iterator();
                while(i.hasNext()) {
                    DataSnapshot next = i.next();

                    FirebaseRTDBModel model = (FirebaseRTDBModel) next.getValue(clazz);
                    model.setHash(next.getKey());

                    updateMensagens.updateMensagem(model);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.d("FirebaseDatabase", "Erro ao ler ", error.toException());
            }
        });
    }

    public void addIfNotExists(String raiz, final Plano planoToAdd) {
        final DatabaseReference myRef = database.getReference(raiz);

        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<Plano> planos = new ArrayList<Plano>();
                boolean achei = false;
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    Plano p = data.getValue(Plano.class);
                    planos.add(p);
                }
                for ( Plano p : planos) {
                    if ( p.getNome().equals(planoToAdd.getNome()) ) achei = true;
                }
                if ( ! achei ) myRef.push().setValue(planoToAdd);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.d("FirebaseDatabase", "Erro ao ler ", error.toException());
            }
        });
    }
}
