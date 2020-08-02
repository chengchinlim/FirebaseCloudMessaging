package com.cheng.firebasecloudmessaging.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cheng.firebasecloudmessaging.BuildConfig
import com.cheng.firebasecloudmessaging.R
import com.cheng.firebasecloudmessaging.databinding.ActivityMainBinding
import com.cheng.firebasecloudmessaging.models.MyResponse
import com.cheng.firebasecloudmessaging.services.Api
import com.cheng.firebasecloudmessaging.services.RetrofitFactory
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.ktx.Firebase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import okio.BufferedSource
import org.reactivestreams.Subscriber
import timber.log.Timber
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var api: Api
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupButtonLabel()
//        api = RetrofitFactory.getApiInstance()
        firebaseAnalytics = Firebase.analytics
        firebaseAnalytics.setCurrentScreen(this, "Main_Activity", null)
        binding.button1.setOnClickListener {
            firebaseAnalytics.logEvent("button_1") {

            }
        }
        binding.button2.setOnClickListener {
            firebaseAnalytics.logEvent("button_2") {

            }
        }
        binding.button3.setOnClickListener {
            firebaseAnalytics.logEvent("button_3") {

            }
        }
        binding.button4.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 4)
            }
        }
        binding.button5.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 5)
            }
        }
        binding.button6.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 6)
            }
        }
        binding.button7.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 7)
            }
        }
        binding.button8.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 8)
            }
        }
        binding.button9.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 9)
            }
        }
        binding.button10.setOnClickListener {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                param(FirebaseAnalytics.Param.ITEM_ID, 10)
            }
        }
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }



//        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener OnCompleteListener@{ task ->
//            if (!task.isSuccessful) {
//                Timber.w(task.exception)
//                return@OnCompleteListener
//            }
//            val token = task.result?.token
//            Timber.i("Token $token")
//        }
//        api.stream("stop")
//            .flatMap {
//                events(it.source())
//            }
////        Observable.just("a", "b", "c", "d")
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeWith(object : Observer<String> {
//                override fun onComplete() {
//                    Timber.d("onComplete")
//                }
//                override fun onNext(t: String?) {
//                    Timber.d("onNext: $t")
//                }
//
//                override fun onError(t: Throwable?) {
//                    Timber.e("onError: ${t?.stackTrace}")
//                }
//
//                override fun onSubscribe(d: Disposable?) {
//                    Timber.d("onSubscribe")
//                }
//            })

    }

//    private fun events(source: BufferedSource): Observable<String> {
//        return Observable.create { emitter ->
//            try {
//                while (!source.exhausted()) {
////                    Timber.d("Loop")
//                    emitter.onNext(source.readUtf8Line())
//                }
//                emitter.onComplete()
//            } catch (e: IOException) {
//                e.printStackTrace()
//                emitter.onError(e)
//            }
//        }
//    }

//    class Rx<T> {
//        companion object {
//
//        }
//    }

    private fun setupButtonLabel() {
        binding.button1.text = resources.getStringArray(R.array.buttons)[0]
        binding.button2.text = resources.getStringArray(R.array.buttons)[1]
        binding.button3.text = resources.getStringArray(R.array.buttons)[2]
        binding.button4.text = resources.getStringArray(R.array.buttons)[3]
        binding.button5.text = resources.getStringArray(R.array.buttons)[4]
        binding.button6.text = resources.getStringArray(R.array.buttons)[5]
        binding.button7.text = resources.getStringArray(R.array.buttons)[6]
        binding.button8.text = resources.getStringArray(R.array.buttons)[7]
        binding.button9.text = resources.getStringArray(R.array.buttons)[8]
        binding.button10.text = resources.getStringArray(R.array.buttons)[9]
    }

}
