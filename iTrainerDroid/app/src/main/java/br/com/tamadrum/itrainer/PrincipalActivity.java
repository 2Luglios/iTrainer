package br.com.tamadrum.itrainer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.firebase.messaging.FirebaseMessaging;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBGetCount;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBGetLastDate;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBUpdate;
import br.com.tamadrum.itrainer.firebase.FirebaseUtilDB;
import br.com.tamadrum.itrainer.fragments.CalendarioFragment;
import br.com.tamadrum.itrainer.modelo.Academia;
import br.com.tamadrum.itrainer.modelo.Depoimento;
import br.com.tamadrum.itrainer.modelo.MapAnamnese;
import br.com.tamadrum.itrainer.modelo.MapContato;
import br.com.tamadrum.itrainer.modelo.MapEndereco;
import br.com.tamadrum.itrainer.modelo.Personal;
import br.com.tamadrum.itrainer.modelo.Plano;
import br.com.tamadrum.itrainer.modelo.Treino;
import br.com.tamadrum.itrainer.modelo.Usuario;
import br.com.tamadrum.itrainer.firebase.SendMsg;


import static android.R.attr.radius;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_principal_layout);

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, new CalendarioFragment());
        transaction.commit();

        

        addPlanos();

        new FirebaseUtilDB().getCount("treinos", new FirebaseRTDBGetCount() {
            @Override
            public void getCount(long qtd) {
                ((TextView)findViewById(R.id.qtdTreinos)).setText(Long.toString(qtd));
            }
        });

        new FirebaseUtilDB().getUltimoTreino("treinos", new FirebaseRTDBGetLastDate() {
            @Override
            public void lastDate(String data) {
                ((TextView)findViewById(R.id.dataUltimoTreino)).setText(data);
            }
        });

        ImageButton btnEditCadastro = (ImageButton) findViewById(R.id.btnEditCadastro);
        btnEditCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PrincipalActivity.this, "Cadastro...", Toast.LENGTH_LONG).show();
                //startActivity(new Intent(PrincipalActivity.this, CadastroActivity.class));
            }
        });

        Button btnAddPersonal = (Button) findViewById(R.id.addpersonal);
        btnAddPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Personal personal = new Personal();
                personal.setCrefi("1234567890");
                personal.setMiniCurriculum("Gosto de longos passeios na praia");
                personal.setClassificacao(5);
                personal.setEspecialidades(Arrays.asList("Lutas", "Fitness"));
                //personal.setNome("Alexandre Dudalski");
                personal.setRegioes(Arrays.asList("Móoca", "Vila Prudente", "Belenzinho"));

                Map<String, String> contato2 = new HashMap<>();
                contato2.put("email", "alexandre.dudalski@gmail.com");
                contato2.put("telefone", "11982447698");
                //personal.setContato(contato2);

                Toast.makeText(PrincipalActivity.this, "Add Personal...", Toast.LENGTH_LONG).show();
                new FirebaseUtilDB().saveOrUpdate("personals", personal);

                //lerTreinos("personals");
            }
        });

        Button btnAddUsuario = (Button) findViewById(R.id.addusuario);
        btnAddUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario u = new Usuario();
                u.setNome("Ettore Luglio");
                u.setAulasRestantes(2);
                u.setAutoRenovacao(false);
                u.setDataCadastro(new Date().getTime());
                u.setLembrete("ilka");
                u.setPlano("Gold");

                MapContato contato = new MapContato();
                contato.setEmail("ettore.tamadrum@gmail.com");
                contato.setTelefone("11982447698");
                u.setContato(contato.getMapa());

                MapEndereco endereco = new MapEndereco();
                endereco.setCep("03227-150");
                endereco.setNumero("93");
                endereco.setComplemento("Apto 151A");
                u.setEndereco(endereco.getMapa());

                MapAnamnese anamnese = new MapAnamnese();
                anamnese.setPeso(98.0);
                anamnese.setAltura(78.0);
                u.setAnamnese(anamnese.getMapa());

                Toast.makeText(PrincipalActivity.this, "Add Usuario...", Toast.LENGTH_LONG).show();
                new FirebaseUtilDB().saveOrUpdate("usuarios", u);

                //lerTreinos("usuarios");
            }
        });

        Button btnAddTreino = (Button) findViewById(R.id.addtreinos);
        btnAddTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Treino treino = new Treino();
                treino.setAcademia("lalalala");
                treino.setDataInicial(new Date().getTime());
                treino.setDataFinal(new Date().getTime() + 1*60*60*1000);
                treino.setPersonal("lelelelele");
                treino.setUsuario("eueueueueueu");
                treino.setConfirmado("pendente");

                Toast.makeText(PrincipalActivity.this, "Add Treinos...", Toast.LENGTH_LONG).show();
                new FirebaseUtilDB().saveOrUpdate("treinos", treino);

                //lerTreinos("treinos");
            }
        });

        Button btnAddAcademia = (Button) findViewById(R.id.addacademia);
        btnAddAcademia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Academia academia = new Academia();
                academia.setNome("SportK");
                Map<String, String> contato3 = new HashMap<>();
                contato3.put("email", "paschoal.taglia@gmail.com");
                contato3.put("telefone", "11xxxx000002");
                academia.setContato(contato3);

                Map<String, String> endereco2 = new HashMap<>();
                endereco2.put("cep", "03227-150");
                endereco2.put("numero", "93");
                endereco2.put("complemento", "Apto 151A");
                endereco2.put("cidade", "São Paulo");
                endereco2.put("estado", "SP");
                endereco2.put("pais", "Brasil");
                academia.setEndereco(endereco2);
                academia.setAparelhos(Arrays.asList("Cybex", "Leg Press 90 graus"));
                academia.setSalas(Arrays.asList("Sala de Spinning", "Sala de Boxe"));

                Toast.makeText(PrincipalActivity.this, "Add Academia...", Toast.LENGTH_LONG).show();
                new FirebaseUtilDB().saveOrUpdate("academias", academia);

                //lerTreinos("academias");
            }
        });

        Button btnAddDepoimentos = (Button) findViewById(R.id.adddepoimentos);
        btnAddDepoimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Depoimento depoimento = new Depoimento();
                depoimento.setUsuario("kjahsdgkjbasd");
                depoimento.setPersonal("hjkasdbvjkhdbsfv");
                depoimento.setAvaliacao("Gostei da pontualidade e do carisma");
                depoimento.setData(new Date().getTime());
                depoimento.setRating(4.5);

                Toast.makeText(PrincipalActivity.this, "Add Depoimentos...", Toast.LENGTH_LONG).show();
                new FirebaseUtilDB().saveOrUpdate("depoimentos", depoimento);

                //lerTreinos("depoimentos");
            }
        });

        FirebaseMessaging.getInstance().subscribeToTopic("user_personal_"+"puf");

    }

    private void addPlanos() {
        Plano plano1 = new Plano();
        plano1.setAulas(12);
        plano1.setNome("Gold");
        plano1.setValorPorAula(80);
        plano1.setValorTotal(1200);
        new FirebaseUtilDB().addIfNotExists("planos", plano1);

        Plano plano2 = new Plano();
        plano2.setAulas(8);
        plano2.setNome("Silver");
        plano2.setValorPorAula(90);
        plano2.setValorTotal(720);
        new FirebaseUtilDB().addIfNotExists("planos", plano2);

        Plano plano3 = new Plano();
        plano3.setAulas(4);
        plano3.setNome("Bronze");
        plano3.setValorPorAula(100);
        plano3.setValorTotal(400);
        new FirebaseUtilDB().addIfNotExists("planos", plano3);
    }

    
}
