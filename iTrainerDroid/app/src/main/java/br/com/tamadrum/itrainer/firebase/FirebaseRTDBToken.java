package br.com.tamadrum.itrainer.firebase;

/**
 * Created by ettoreluglio on 16/08/17.
 */

public interface FirebaseRTDBToken extends FirebaseRTDBInterface {

    public void setToken(String token);
    public String getToken();
}
