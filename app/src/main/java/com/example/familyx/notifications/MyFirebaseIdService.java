package com.example.familyx.notifications;

import androidx.annotation.NonNull;

import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIdService extends FirebaseMessagingService  {
    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);

    }
}
