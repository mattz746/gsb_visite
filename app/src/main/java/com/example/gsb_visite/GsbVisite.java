package com.example.gsb_visite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GsbVisite {

    @GET("login_check")
    Call<Token> getToken();

}

