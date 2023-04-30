package com.example.gsb_visite;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Visiteur implements Serializable {
    @SerializedName("")
    private String username;

    @SerializedName("")
    private String password;

    @SerializedName("")
    private String matricule;

    @SerializedName("")
    private String tel;

    @SerializedName("")
    private String nom;

    @SerializedName("")
    private String prenom;

    public Visiteur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {return username;}

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getTel() {
        return tel;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


}
