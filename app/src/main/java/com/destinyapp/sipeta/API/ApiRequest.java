package com.destinyapp.sipeta.API;

import com.destinyapp.sipeta.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiRequest {
    //GET
    @GET("berita")
    Call<ResponseModel> berita();
}
