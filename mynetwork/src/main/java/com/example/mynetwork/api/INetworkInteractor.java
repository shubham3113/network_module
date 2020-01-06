package com.example.mynetwork.api;

import com.casadigi.networkmodule.requestPojo.CasaMailerRequestPojo;
import com.casadigi.networkmodule.requestPojo.SupportPostRequestPojo;
import com.casadigi.networkmodule.requestPojo.UserDeviceInputPojo;
import com.casadigi.networkmodule.responsepojo.CasaMailerResponsePojo;
import com.casadigi.networkmodule.responsepojo.InfoResponsePojo;
import com.casadigi.networkmodule.responsepojo.ProfileResponsePojo;
import com.casadigi.networkmodule.responsepojo.PushUpdateResponsePojo;
import com.casadigi.networkmodule.responsepojo.SupportResponsePojo;
import com.casadigi.networkmodule.responsepojo.UserDeviceOutputPojo;
import com.casadigi.networkmodule.responsepojo.permissionapipojo.PermissionApiPojo;

/**
 * This interface holds api calling stuffs.
 */
public interface INetworkInteractor {

  void userDeviceCall(UserDeviceInputPojo userDeviceInputPojo, HeaderInfo headerInfo,
                      OnUserDeviceListener onResponseListener);

  interface OnUserDeviceListener {

    void onSuccess(UserDeviceOutputPojo userDeviceOutputPojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void infoAPICall(HeaderInfo headerInfo, OnInfoListener onInfoListener, String baseUrl);

  interface OnInfoListener {

    void onSuccess(InfoResponsePojo infoResponsePojo, String baseUrl);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void getPermissionApiCall(HeaderInfo headerInfo, OnPermissionListener onPermissionListener, String deviceId);

  interface OnPermissionListener {

    void onSuccess(PermissionApiPojo permissionApiPojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void putFavouriteTable(HeaderInfo headerInfo, OnFavouriteTableListener onFavouriteTableListener);

  interface OnFavouriteTableListener {

    void onSuccess(String data);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void getProfileCall(HeaderInfo headerInfo, OnProfileResponse onProfileResponse);

  interface OnProfileResponse {

    void onSuccess(ProfileResponsePojo profileResponsePojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void getPushupdatesCall(HeaderInfo headerInfo, OnPushupdateResponse onPushupdateResponse);

  interface OnPushupdateResponse {

    void onSuccess(PushUpdateResponsePojo pushUpdateResponsePojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void supportCall(HeaderInfo headerInfo, OnSupportResponse onSupportResponse);

  interface OnSupportResponse {

    void onSuccess(SupportResponsePojo supportResponsePojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void supportPostCall(SupportPostRequestPojo supportPostRequestPojo, HeaderInfo headerInfo,
                       OnSupportPostResponse onSupportResponse);

  interface OnSupportPostResponse {

    void onSuccess(SupportResponsePojo supportPostRequestPojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void casaMailerCall(CasaMailerRequestPojo casaMailerRequestPojo, HeaderInfo headerInfo,
                      OnCasaMailerResponse onCasaMailerResponse);

  interface OnCasaMailerResponse {

    void onSuccess(CasaMailerResponsePojo casaMailerResponsePojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }


  ////////************************************************************************************
  ///////*********************** Demo Mode Code Stuff ****************************************

  void getDemoApiCall(HeaderInfo headerInfo, OnDemoApiResponse onDemoApiResponse);

  interface OnDemoApiResponse {

    void onSuccess(String response);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void getDemoInfoApiCall(HeaderInfo headerInfo, OnDemoInfoApiResponse onDemoApiResponse);

  interface OnDemoInfoApiResponse {

    void onSuccess(String response);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

  void registerUserDeviceForDemoMode(UserDeviceInputPojo userDeviceInputPojo, HeaderInfo headerInfo,
                                     OnRegisterDeviceForDemoMode onResponseListener);

  interface OnRegisterDeviceForDemoMode {

    void onSuccess(UserDeviceOutputPojo userDeviceOutputPojo);

    void onFailed(String errorMsg);

    void onError(String errorMsg);
  }

    void pushUpdateAcknowleage(HeaderInfo headerInfo, onPushUpdateACKListner onAckListener, final String deviceId, String updateType);

    interface onPushUpdateACKListner {

        void onSuccess(String response);

        void onFailed(String errorMsg);

        void onError(String errorMsg);
    }

  ////////************************************************************************************
  ///////*********************** Demo Mode Code Stuff ****************************************
}
