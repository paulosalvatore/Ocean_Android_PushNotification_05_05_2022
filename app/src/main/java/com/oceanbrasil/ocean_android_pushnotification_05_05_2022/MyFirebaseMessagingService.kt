package com.oceanbrasil.ocean_android_pushnotification_05_05_2022

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        // Podemos trabalhar com o token, enviando para o backend
        // ou algo do tipo
        Log.d("FIREBASE", "Token atualizado: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        Log.d("FIREBASE", "Message received: $message")
    }
}
