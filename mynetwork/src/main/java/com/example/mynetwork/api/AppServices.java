package com.example.mynetwork.api;

import com.casadigi.networkmodule.networkutil.NetworkUtility;
import com.casadigi.networkmodule.requestPojo.CasaMailerRequestPojo;
import com.casadigi.networkmodule.requestPojo.SupportPostRequestPojo;
import com.casadigi.networkmodule.requestPojo.UserDeviceInputPojo;
import com.casadigi.networkmodule.responsepojo.DefaultResponsePojo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

interface AppServices {

    @POST(NetworkUtility.SUB_BASE_URL + "UserDevices")
    Call<DefaultResponsePojo> userDevices(@Body UserDeviceInputPojo userDeviceInputPojo);

    @PUT("mymovie/index.php/favourite/fav")
    Call<DefaultResponsePojo> putFavouriteTable();

    @PUT(NetworkUtility.SUB_BASE_URL + "Pushupdate")
    Call<DefaultResponsePojo> pushUpdateAck(@Query("update_type") String updateType, @Query("vendor_id") String deviceId);

    @GET(NetworkUtility.SUB_BASE_URL + "Info")
    Call<DefaultResponsePojo> infoCall(@Query("base_url") String baseUrl);

    @GET(NetworkUtility.SUB_BASE_URL + "Permissions")
    Call<DefaultResponsePojo> getPermission(@Query("vendor_id") String deviceId);

    @GET(NetworkUtility.SUB_BASE_URL + "Profiles")
    Call<DefaultResponsePojo> getProfiles();

    @GET(NetworkUtility.SUB_BASE_URL + "Pushupdate")
    Call<DefaultResponsePojo> pushUpdates();

    @GET(NetworkUtility.SUB_BASE_URL + "Supports")
    Call<DefaultResponsePojo> supports();

    @POST(NetworkUtility.SUB_BASE_URL + "Supports")
    Call<DefaultResponsePojo> supportsPost(SupportPostRequestPojo supportPostRequestPojo);

    @POST(NetworkUtility.SUB_BASE_URL + "CasaMailer")
    Call<DefaultResponsePojo> casaMailer(CasaMailerRequestPojo casaMailerRequestPojo);


    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************
    @GET("https://studio.casadigi.com/casadigi-cloud-api/Info")
    Call<DefaultResponsePojo> getDemoApi();

    @GET("/casadigihomeserver/Info")
    Call<DefaultResponsePojo> getDemoInfoApi();

    @GET("/UserDevices")
    Call<DefaultResponsePojo> registerUserDeviceForDemoMode();
    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************
}
