package com.example.pushnotification.notification

import android.content.Intent
import com.example.pushnotification.MainActivity
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

//note no need to use FirebaseInstanceIdService,as it  is deprecated
class MyFirebaseMessagingService : FirebaseMessagingService(){

    override fun onNewToken(string: String) {
        super.onNewToken(string)
        startService(Intent(this,MainActivity::class.java))
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
    }
}