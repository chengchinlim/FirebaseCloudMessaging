package com.cheng.firebasecloudmessaging.services

import com.cheng.firebasecloudmessaging.models.MyResponse
import io.reactivex.rxjava3.core.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Streaming

interface Api {

    @GET("/")
    @Streaming
    fun stream(
        @Query("switch") switch: String
    ): Observable<ResponseBody>
}