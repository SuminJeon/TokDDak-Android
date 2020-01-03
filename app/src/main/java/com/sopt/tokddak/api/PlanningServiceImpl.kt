package com.sopt.tokddak.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PlanningServiceImpl {
    private const val BASE_URL = "http://13.125.42.117:3000/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val planningService: PlanningService = retrofit.create(PlanningService::class.java)
}