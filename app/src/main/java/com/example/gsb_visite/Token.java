package com.example.gsb_visite;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Token implements Serializable {
    @SerializedName("token")
    private String token;

    private String getToken() {
        return token;
    }
}
