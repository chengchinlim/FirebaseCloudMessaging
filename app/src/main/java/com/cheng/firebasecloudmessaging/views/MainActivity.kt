package com.cheng.firebasecloudmessaging.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cheng.firebasecloudmessaging.BuildConfig
import com.cheng.firebasecloudmessaging.R
import com.google.firebase.iid.FirebaseInstanceId
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener OnCompleteListener@{ task ->
            if (!task.isSuccessful) {
                Timber.w(task.exception)
                return@OnCompleteListener
            }
            val token = task.result?.token
            Timber.i("Token $token")
        }
    }

}
