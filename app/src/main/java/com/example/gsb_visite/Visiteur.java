package com.example.gsb_visite;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

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

    @SerializedName("praticien")
    private ArrayList<String>praticiensStr;

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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<String> getPraticiensStr() {
        return praticiensStr;
    }
}
