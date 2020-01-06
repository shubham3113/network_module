package com.example.mynetwork.api;


import com.example.mynetwork.networkutil.APIValidation;
import com.example.mynetwork.requestPojo.CasaMailerRequestPojo;
import com.example.mynetwork.requestPojo.SupportPostRequestPojo;
import com.example.mynetwork.requestPojo.UserDeviceInputPojo;
import com.example.mynetwork.responsepojo.CasaMailerResponsePojo;
import com.example.mynetwork.responsepojo.DefaultResponsePojo;
import com.example.mynetwork.responsepojo.InfoResponsePojo;
import com.example.mynetwork.responsepojo.ProfileResponsePojo;
import com.example.mynetwork.responsepojo.PushUpdateResponsePojo;
import com.example.mynetwork.responsepojo.SupportResponsePojo;
import com.example.mynetwork.responsepojo.UserDeviceOutputPojo;
import com.example.mynetwork.responsepojo.permissionapipojo.PermissionApiPojo;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NetworkInteractor implements INetworkInteractor {

    @Override
    public void userDeviceCall(UserDeviceInputPojo userDeviceInputPojo, HeaderInfo headerInfo,
                               final OnUserDeviceListener onResponseListener) {
        final Call<DefaultResponsePojo> responseUserDeviceCallback = ServiceWrapper
                .getInstance(headerInfo).userDeviceAPI(userDeviceInputPojo);
        responseUserDeviceCallback.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (responseUserDeviceCallback == null || responseUserDeviceCallback.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();

                        String responseString = gson.toJson(response.body());
                        String result = "";
                        try {
                            result = URLDecoder.decode(responseString, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        UserDeviceOutputPojo userDeviceOutputPojo = gson
                                .fromJson(result, UserDeviceOutputPojo.class);
                        onResponseListener.onSuccess(userDeviceOutputPojo);
                    } else {
                        onResponseListener.onError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                if (responseUserDeviceCallback == null || responseUserDeviceCallback.isCanceled()) {
                    return;
                }
                onResponseListener.onFailed(t.getMessage());
            }
        });
    }

    @Override
    public void infoAPICall(HeaderInfo headerInfo, final OnInfoListener onInfoListener,
                            final String baseUrl) {
        ServiceWrapper.service = null;
        ServiceGenerator.BASE_URL = baseUrl;
        final Call<DefaultResponsePojo> infoPojoCall = ServiceWrapper.getInstance(headerInfo)
                .infoCallAPI(baseUrl);
        infoPojoCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (infoPojoCall == null || infoPojoCall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        InfoResponsePojo infoResponsePojo = gson
                                .fromJson(responseString, InfoResponsePojo.class);
                        onInfoListener.onSuccess(infoResponsePojo, baseUrl);
                    } else {
                        onInfoListener.onError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onInfoListener.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void pushUpdateAcknowleage(HeaderInfo headerInfo, final onPushUpdateACKListner onInfoListener,
                                      final String deviceId, String updateType) {
        final Call<DefaultResponsePojo> infoPojoCall = ServiceWrapper.getInstance(headerInfo)
                .putPushUpdateAck(updateType, deviceId);
        infoPojoCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (infoPojoCall == null || infoPojoCall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        onInfoListener.onSuccess(responseString);
                    } else {
                        onInfoListener.onError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onInfoListener.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void putFavouriteTable(HeaderInfo headerInfo,
                                  final OnFavouriteTableListener onFavouriteTableListener) {
        ServiceWrapper.service = null;
        final Call<DefaultResponsePojo> favouriteTablePojo = ServiceWrapper.getInstance(headerInfo)
                .putFavouriteTable();
        favouriteTablePojo.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (favouriteTablePojo == null || favouriteTablePojo.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        onFavouriteTableListener.onSuccess("Success");
                    } else {
                        onFavouriteTableListener.onError(response.body().getMessage());
                    }
                } else {
                    onFavouriteTableListener.onSuccess("Success");
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onFavouriteTableListener.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void getPermissionApiCall(HeaderInfo headerInfo,
                                     final OnPermissionListener onPermissionListener, String deviceId) {
        final Call<DefaultResponsePojo> permissionApi = ServiceWrapper.getInstance(headerInfo)
                .getPermissionApi(deviceId);
        permissionApi.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (permissionApi == null || permissionApi.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        PermissionApiPojo permissionApiPojo = gson
                                .fromJson(responseString, PermissionApiPojo.class);
                        onPermissionListener.onSuccess(permissionApiPojo);
                    } else {
                        onPermissionListener.onError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onPermissionListener.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void getProfileCall(HeaderInfo headerInfo, final OnProfileResponse onProfileResponse) {
        final Call<DefaultResponsePojo> profileResponsecall = ServiceWrapper.getInstance(headerInfo)
                .getProfilesAPI();
        profileResponsecall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (profileResponsecall == null || profileResponsecall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        ProfileResponsePojo profileResponsePojo = gson
                                .fromJson(responseString, ProfileResponsePojo.class);
                        onProfileResponse.onSuccess(profileResponsePojo);
                    } else {
                        onProfileResponse.onError(response.body().getMessage());
                    }
                } else {
                    onProfileResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onProfileResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }


    @Override
    public void getPushupdatesCall(HeaderInfo headerInfo,
                                   final OnPushupdateResponse onPushupdateResponse) {
        final Call<DefaultResponsePojo> pushUpdateResponsePojoCall = ServiceWrapper
                .getInstance(headerInfo).pushUpdateAPI();
        pushUpdateResponsePojoCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (pushUpdateResponsePojoCall == null || pushUpdateResponsePojoCall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        PushUpdateResponsePojo pushUpdateResponsePojo = gson
                                .fromJson(responseString, PushUpdateResponsePojo.class);
                        onPushupdateResponse.onSuccess(pushUpdateResponsePojo);
                    } else {
                        onPushupdateResponse.onError(response.body().getMessage());
                    }
                } else {
                    onPushupdateResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onPushupdateResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void supportCall(HeaderInfo headerInfo, final OnSupportResponse onSupportResponse) {
        final Call<DefaultResponsePojo> supportCall = ServiceWrapper.getInstance(headerInfo).supports();
        supportCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (supportCall == null || supportCall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        SupportResponsePojo supportResponsePojo = gson
                                .fromJson(responseString, SupportResponsePojo.class);
                        onSupportResponse.onSuccess(supportResponsePojo);
                    } else {
                        onSupportResponse.onError(response.body().getMessage());
                    }

                } else {
                    onSupportResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onSupportResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void supportPostCall(SupportPostRequestPojo supportPostRequestPojo, HeaderInfo headerInfo,
                                final OnSupportPostResponse onSupportPostResponse) {
        final Call<DefaultResponsePojo> supportPostCall = ServiceWrapper.getInstance(headerInfo)
                .supportsPost(supportPostRequestPojo);
        supportPostCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (supportPostCall == null || supportPostCall.isCanceled()) {
                    return;
                }

                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        SupportResponsePojo supportResponsePojo = gson
                                .fromJson(responseString, SupportResponsePojo.class);
                        onSupportPostResponse.onSuccess(supportResponsePojo);
                    } else {
                        onSupportPostResponse.onError(response.body().getMessage());
                    }
                } else {
                    onSupportPostResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onSupportPostResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void casaMailerCall(final CasaMailerRequestPojo casaMailerRequestPojo,
                               HeaderInfo headerInfo, final OnCasaMailerResponse onCasaMailerResponse) {
        final Call<DefaultResponsePojo> casaMailerResponsePojoCall = ServiceWrapper
                .getInstance(headerInfo).casaMailer(casaMailerRequestPojo);

        casaMailerResponsePojoCall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (casaMailerResponsePojoCall == null || casaMailerResponsePojoCall.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        CasaMailerResponsePojo casaMailerResponsePojo = gson
                                .fromJson(responseString, CasaMailerResponsePojo.class);
                        onCasaMailerResponse.onSuccess(casaMailerResponsePojo);
                    } else {
                        onCasaMailerResponse.onError(response.body().getMessage());
                    }
                } else {
                    onCasaMailerResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onCasaMailerResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }

    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************

    @Override
    public void getDemoApiCall(HeaderInfo headerInfo, final OnDemoApiResponse onProfileResponse) {
        final Call<DefaultResponsePojo> profileResponsecall = ServiceWrapper.getInstance(headerInfo)
                .getDemoApi();
        profileResponsecall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                try {
                    if (profileResponsecall == null || profileResponsecall.isCanceled()) {
                        return;
                    }
                    if (response.body() != null) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        onProfileResponse.onSuccess(responseString);
                    } else {
                        onProfileResponse.onError(response.body().getMessage());
                    }
                } catch (NullPointerException n) {
                    n.printStackTrace();
                    onProfileResponse.onError("Something went wrong.");
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onProfileResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }


    @Override
    public void getDemoInfoApiCall(HeaderInfo headerInfo,
                                   final OnDemoInfoApiResponse onDemoApiResponse) {
        ServiceWrapper.service = null;
        final Call<DefaultResponsePojo> profileResponsecall = ServiceWrapper.getInstance(headerInfo)
                .getDemoInfoApiCall();
        profileResponsecall.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (profileResponsecall == null || profileResponsecall.isCanceled()) {
                    return;
                }
                if (response.body() != null) {
                    Gson gson = new Gson();
                    String responseString = gson.toJson(response.body());
                    onDemoApiResponse.onSuccess(responseString);
                } else {
                    onDemoApiResponse.onError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                onDemoApiResponse.onFailed(t.getLocalizedMessage());
            }
        });
    }


    @Override
    public void registerUserDeviceForDemoMode(UserDeviceInputPojo userDeviceInputPojo, HeaderInfo headerInfo,
                                              final OnRegisterDeviceForDemoMode onResponseListener) {
        final Call<DefaultResponsePojo> responseUserDeviceCallback = ServiceWrapper
                .getInstance(headerInfo).userDeviceAPI(userDeviceInputPojo);
        responseUserDeviceCallback.enqueue(new Callback<DefaultResponsePojo>() {
            @Override
            public void onResponse(Call<DefaultResponsePojo> call,
                                   Response<DefaultResponsePojo> response) {
                if (responseUserDeviceCallback == null || responseUserDeviceCallback.isCanceled()) {
                    return;
                }
                if (response.body() != null && response.isSuccessful()) {
                    if (APIValidation.isResponseValid(response.body().getResultCode())) {
                        Gson gson = new Gson();
                        String responseString = gson.toJson(response.body());
                        UserDeviceOutputPojo userDeviceOutputPojo = gson
                                .fromJson(responseString, UserDeviceOutputPojo.class);
                        onResponseListener.onSuccess(userDeviceOutputPojo);
                    } else {
                        onResponseListener.onError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponsePojo> call, Throwable t) {
                if (responseUserDeviceCallback == null || responseUserDeviceCallback.isCanceled()) {
                    return;
                }
                onResponseListener.onFailed(t.getMessage());
            }
        });
    }

    ////////************************************************************************************
    ///////*********************** Demo Mode Code Stuff ****************************************
}
