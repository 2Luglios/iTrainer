package br.com.tamadrum.itrainer.firebase;

import android.content.Context;
import android.os.AsyncTask;

import com.google.firebase.iid.FirebaseInstanceId;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ettoreluglio on 20/07/17.
 */

public class SendMsg {

    private static final String URL_FIREBASE_FUNCTION_SEND_MSG = "https://us-central1-itrainer-2c9c2.cloudfunctions.net/sendMSG";
    private Context ctx;

    public SendMsg(Context ctx) {
        this.ctx = ctx;
    }

    public void sendMsg(String user, String msg) {
        AsyncTask<String, Integer, String> task = new AsyncTask<String, Integer, String>() {

            @Override
            protected String doInBackground(String... strings) {
                try {
                    URL url = new URL(URL_FIREBASE_FUNCTION_SEND_MSG
                            + "?user=" + strings[0]
                            + "&msg=" + URLEncoder.encode(strings[1], "utf-8")
                            + "&origin=" + FirebaseInstanceId.getInstance().getToken());

                    InputStream is = url.openStream();

                    return new Scanner(is).next();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return "nok";
            }

        };

        task.execute(user, msg);
    }

}
