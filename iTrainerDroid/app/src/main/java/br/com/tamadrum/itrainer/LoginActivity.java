package br.com.tamadrum.itrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    private CallbackManager mCallbackManager;
    private AccessTokenTracker accessTokenTracker;
    private AccessToken accessToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);

        mCallbackManager = CallbackManager.Factory.create();

        accessTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(
                    AccessToken oldAccessToken,
                    AccessToken currentAccessToken) {
                Log.d("LoginActivity", "accessToken atualizado: " + currentAccessToken);
            }
        };

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("LoginActivity", "Google Token: " + refreshedToken);
        final DatabaseReference myRef = database.getReference("idGoogle");
        myRef.setValue(refreshedToken);

        // If the access token is available already assign it.
        accessToken = AccessToken.getCurrentAccessToken();
        if ( accessToken != null ) {
            Log.d("LoginActivity", "Já está logado, vai pro principal!");

            finish();

            final DatabaseReference myRefNovo = database.getReference("idFacebook");
            myRefNovo.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String value = dataSnapshot.getValue(String.class);
                    if ( value == null ) {
                        value = accessToken.getToken();
                        myRefNovo.setValue(value);
                    }
                    Log.d("LoginActivity", "Facebook Token: " + value);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.w("LoginActivity", "Failed to read value.", databaseError.toException());
                }
            });
        }

        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email", "public_profile");
        loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d("LoginActivity", "facebook:onSuccess:" + loginResult);
                Log.d("LoginActivity", "" + loginResult.getAccessToken());

                finish();
            }

            @Override
            public void onCancel() {
                Log.d("LoginActivity", "facebook:onCancel");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d("LoginActivity", "facebook:onError", error);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        accessTokenTracker.stopTracking();
    }

}
