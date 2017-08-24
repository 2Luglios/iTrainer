package br.com.tamadrum.itrainer.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.tamadrum.itrainer.PrincipalActivity;
import br.com.tamadrum.itrainer.R;
import br.com.tamadrum.itrainer.customview.CustomCalendarioView;
import br.com.tamadrum.itrainer.customview.OnDateChangeListener;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBGetCount;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBGetLastDate;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBUpdate;
import br.com.tamadrum.itrainer.firebase.FirebaseUtilDB;
import br.com.tamadrum.itrainer.firebase.SendMsg;
import br.com.tamadrum.itrainer.modelo.Treino;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class CalendarioFragment extends Fragment {

    private CustomCalendarioView calendario;
    private View inflate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.activity_calendario_layout, null);

        lerTreinos("treinos");

        final ListView listaEventos = (ListView) inflate.findViewById(R.id.listaEventos);

        listaEventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                new SendMsg(getContext()).sendMsg("puf", "Podemos marcar uma aula?");
                Toast.makeText(getContext(), "Quero Treinar", Toast.LENGTH_LONG).show();
            }
        });

        listaEventos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                new SendMsg(getContext()).sendMsg("puf", "Lógico, marcado no dia solicitado! Até lá!");
                Toast.makeText(getContext(), "Confirmacao", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        calendario = (CustomCalendarioView) inflate.findViewById(R.id.calendario);
        calendario.setDataHoje(Calendar.getInstance());
        calendario.setOnDateChangeListener(new OnDateChangeListener() {
            public void onDateChange(Calendar data){
//                carregaLista();
            }
        });

        Button btnAddTreino = (Button) inflate.findViewById(R.id.addTreino);
        btnAddTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "AddTreino", Toast.LENGTH_LONG).show();
            }
        });

        return inflate;
    }

    private void lerTreinos(final String raiz) {

        final ListView listaEventos = (ListView) inflate.findViewById(R.id.listaEventos);
        new FirebaseUtilDB().readRTDB(raiz, Treino.class, new FirebaseRTDBUpdate() {

            final List<Treino> l = new ArrayList();

            @Override
            public void updateMensagem(Object obj) {

                l.add((Treino)obj);

                final ListAdapter adapter = new ArrayAdapter<Treino>(getContext(), android.R.layout.simple_list_item_1, l) {
                    @NonNull
                    @Override
                    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                        View v = LayoutInflater.from(getContext()).inflate(R.layout.item_treino_layout, null);
//                        ((TextView)v.findViewById(R.id.atividade)).setText(l.get(position).getHash());
                        return v;
                    }
                };

                listaEventos.setAdapter(adapter);
            }
        });
    }
}
