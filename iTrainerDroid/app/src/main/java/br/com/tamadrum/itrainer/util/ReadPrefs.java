package br.com.tamadrum.itrainer.util;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ettoreluglio on 15/07/17.
 */

public class ReadPrefs {

    private Context ctx;

    public ReadPrefs(Context ctx) {
        this.ctx = ctx;
    }

    public List<String> readBairros(String pais, String estado, String cidade) throws IOException {
        List<String> lista = new ArrayList<>();
        InputStream is = ctx.getAssets().open("bairros-" + pais + "-" + estado + "-" + cidade + ".txt");
        Scanner s = new Scanner(is);
        while (s.hasNextLine()) {
            lista.add(s.nextLine());
        }
        return lista;
    }

    public List<String> readPaises() throws IOException {
        List<String> lista = new ArrayList<>();
        InputStream is = ctx.getAssets().open("paises.txt");
        Scanner s = new Scanner(is);
        while (s.hasNextLine()) {
            lista.add(s.nextLine());
        }
        return lista;
    }

    public List<String> readCidades(String pais, String estado) throws IOException {
        List<String> lista = new ArrayList<>();
        InputStream is = ctx.getAssets().open("cidades-" + pais + "-" + estado + ".txt");
        Scanner s = new Scanner(is);
        while (s.hasNextLine()) {
            lista.add(s.nextLine());
        }
        return lista;
    }

    public List<String> readEstados(String pais) throws IOException {
        List<String> lista = new ArrayList<>();
        InputStream is = ctx.getAssets().open("estados-" + pais + ".txt");
        Scanner s = new Scanner(is);
        while (s.hasNextLine()) {
            lista.add(s.nextLine());
        }
        return lista;
    }

}
