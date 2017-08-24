package br.com.tamadrum.itrainer.service;

import android.util.Log;

import com.facebook.AccessToken;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ettoreluglio on 13/05/17.
 */

public class ServiceMessage extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("LoginActivity", "Refreshed token: " + refreshedToken);

        //sendRegistrationToServer(refreshedToken);
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("idGoogle");

        // Escrevendo no json
//        myRef.setValue(refreshedToken);

    }
}
