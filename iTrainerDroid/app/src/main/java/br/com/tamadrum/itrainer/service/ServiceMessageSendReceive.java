package br.com.tamadrum.itrainer.service;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.internal.DialogPresenter;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

import br.com.tamadrum.itrainer.PrincipalActivity;
import br.com.tamadrum.itrainer.R;

import static android.R.id.message;

/**
 * Created by ettoreluglio on 13/05/17.
 */

public class ServiceMessageSendReceive extends FirebaseMessagingService {

    private Context ctx;
    private String from;
    private String txt;

    @Override
    public void handleIntent(Intent intent) {
        super.handleIntent(intent);

        Bundle bundle = intent.getExtras();

        String title = bundle.getString("gcm.notification.title");
        String body = bundle.getString("gcm.notification.body");

        Log.d("Mensagem", title + " : " + body);
    }

    @Override
    public void onMessageReceived(final RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);


        Map<String, String> data = remoteMessage.getData();
        if (data == null) {
            return;
        }


        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("LoginActivity", "Refreshed token: " + refreshedToken);

        if (remoteMessage.getNotification() != null) {
            from = remoteMessage.getFrom();
            txt = remoteMessage.getNotification().getBody();

            Log.d("Mensagem", txt);
        }







//        data = remoteMessage.getData();
//        String title = remoteMessage.getNotification().getTitle();
//        String message = remoteMessage.getNotification().getBody();
//        String imageUrl = (String) data.get("image");
//        String action = (String) data.get("action");
//        Log.i(TAG, "onMessageReceived: title : "+title);
//        Log.i(TAG, "onMessageReceived: message : "+message);
//        Log.i(TAG, "onMessageReceived: imageUrl : "+imageUrl);
//        Log.i(TAG, "onMessageReceived: action : "+action);
//
//        if (imageUrl == null) {
//            sendNotification(title,message,action);
//        } else {
//            new BigPictureNotification(this,title,message,imageUrl,action);
//        }
    }


}