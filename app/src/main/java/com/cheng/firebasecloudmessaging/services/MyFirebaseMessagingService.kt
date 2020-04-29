package com.cheng.firebasecloudmessaging.services

import androidx.core.app.NotificationManagerCompat
import com.cheng.firebasecloudmessaging.util.NOTIFICATION_ID
import com.cheng.firebasecloudmessaging.util.NotificationUtil
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import timber.log.Timber

class MyFirebaseMessagingService: FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        Timber.i("Refreshed token: $p0")
        super.onNewToken(p0)
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        Timber.i("Message received title: ${p0.notification?.title}")
        Timber.i("Message received body: ${p0.notification?.body}")

        val notificationBuilder = NotificationUtil().createNotification(this)
        with(NotificationManagerCompat.from(this)) {
            notify(NOTIFICATION_ID, notificationBuilder.build())
        }
    }
}