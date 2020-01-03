package com.sopt.tokddak.api

import com.google.gson.annotations.SerializedName
import com.sopt.tokddak.feature.planning.ActivityData
import retrofit2.Call
import retrofit2.http.*

interface PlanningService {

    @GET("median/{CityId}/hotel")
    fun getLodgement(
        @Header("Content-Type") content_type: String,
        @Path("CityId") CityId : Int
        ): Call<GetLodgeData>

    @GET("/median/{CityId}/food")
    fun getFood(
        @Header("Content-Type") content_type: String,
        @Path("CityId") CityId : Int
        ): Call<GetFoodData>

    @GET("citys/{CityId}/Activity")
    fun getActivity(
        @Header("Content-Type") content_type: String,
        @Path("CityId") CityId : Int
    ): Call<GetActivityData>
}

data class GetLodgeData(
    val status: Int,
    val message: String,
    val success: Boolean,
    @SerializedName("data")
    val lodgeData: LodgeResult
)

data class LodgeResult(
    val result: ArrayList<LodgeData>
)

data class LodgeData(
    @SerializedName("category")
    val type: String,
    @SerializedName("cost")
    val avgPrice: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("info")
    val info: ArrayList<LodgeSample>
)

data class LodgeSample(
    val name: String,
    val cost: Int
)

data class GetFoodData(
    val status: Int,
    val message: String,
    @SerializedName("data")
    val foodResult: FoodResult,
    val success: Boolean
)

data class FoodResult(
    val result: ArrayList<FoodData>
)

data class FoodData(
    val category: String,
    val cost: Int,
    val url: String
)

data class GetActivityData(
    val status: Int,
    val message: String,
    val success: Boolean,
    val data: List<ActivityData>
)

/*data class ActivityData(
    val id: Int,
    val name: String,
    val cost: Int,
    val content: String,
    val url_mrt: String,
    val url_kl: String,
    val img: String,
    val CityId: Int
)*/