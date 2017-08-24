package br.com.tamadrum.itrainer.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;

import br.com.tamadrum.itrainer.modelo.Usuario;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class Preferences {

    private Context ctx;
    private SharedPreferences prefs;

    public Preferences(Context ctx) {
        this.ctx = ctx;
        prefs = ctx.getSharedPreferences("iTrainer", Context.MODE_PRIVATE);
    }

    public void setUsuario(Usuario usuario) {

    }

    public Usuario getUsuario() {
        return null;
    }

    public int getInt(String chave) {
        return prefs.getInt(chave, -1);
    }

    public String getString(String chave) {
        return prefs.getString(chave, null);
    }

    public long getLong(String chave) {
        return prefs.getLong(chave, -1);
    }

    public boolean getBoolean(String chave) {
        return prefs.getBoolean(chave, false);
    }

    public void setInt(String chave, int valor) {
        prefs.edit().putInt(chave, valor).commit();
    }

    public void setString(String chave, String valor) {
        prefs.edit().putString(chave, valor).commit();
    }

    public void setLong(String chave, long valor) {
        prefs.edit().putLong(chave, valor).commit();
    }

    public void setBoolean(String chave, boolean valor) {
        prefs.edit().putBoolean(chave, valor).commit();
    }
}
