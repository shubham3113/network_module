package com.example.mynetwork.api;




import com.example.mynetwork.requestPojo.CasaMailerRequestPojo;
import com.example.mynetwork.requestPojo.SupportPostRequestPojo;
import com.example.mynetwork.requestPojo.UserDeviceInputPojo;
import com.example.mynetwork.responsepojo.DefaultResponsePojo;

import retrofit2.Call;

/**
 * <p/>
 * This Wrapper class will be mediator of service interface and calling class. Whatever the features
 * of retrofit and okhttp api will implement, need to be put into this class. We can put common
 * webservice security features to this class so that we can increase the reusability of code.
 */
public class ServiceWrapper {


    public static AppServices service;/*= ServiceGenerator.createService(AppServices.class);*/
    private static ServiceWrapper serviceWrapper = new ServiceWrapper();

    private ServiceWrapper() {

    }

    public static ServiceWrapper getInstance(HeaderInfo headerInfo) {

        //if (service == null) {
            service = ServiceGenerator.createService(AppServices.class, headerInfo);
      //  }

        return serviceWrapper;
    }

    public Call<DefaultResponsePojo> userDeviceAPI(UserDeviceInputPojo userDeviceInputPojo) {
        return service.userDevices(userDeviceInputPojo);
    }

    public Call<DefaultResponsePojo> infoCallAPI(String baseUrl) {
        return service.infoCall(baseUrl);
    }

    public Call<DefaultResponsePojo> getProfilesAPI() {
        return service.getProfiles();
    }

    public Call<DefaultResponsePojo> pushUpdateAPI() {
        return service.pushUpdates();
    }

    public Call<DefaultResponsePojo> supports() {
        return service.supports();
    }

    public Call<DefaultResponsePojo> getPermissionApi(String deviceId) {
        return service.getPermission(deviceId);
    }

    public Call<DefaultResponsePojo> supportsPost(SupportPostRequestPojo supportPostRequestPojo) {
        return service.supportsPost(supportPostRequestPojo);
    }

    public Call<DefaultResponsePojo> casaMailer(CasaMailerRequestPojo casaMailerRequestPojo) {
        return service.casaMailer(casaMailerRequestPojo);
    }

    public Call<DefaultResponsePojo> putFavouriteTable() {
        return service.putFavouriteTable();
    }

    public Call<DefaultResponsePojo> putPushUpdateAck( String updateType, String deviceId) {
        return service.pushUpdateAck(updateType,deviceId);
    }


    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************

    public Call<DefaultResponsePojo> getDemoApi() {
        return service.getDemoApi();
    }

    public Call<DefaultResponsePojo> getDemoInfoApiCall() {
        return service.getDemoInfoApi();
    }

    public Call<DefaultResponsePojo> registerUserDeviceForDemoMode() {
        return service.registerUserDeviceForDemoMode();
    }
    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************
}