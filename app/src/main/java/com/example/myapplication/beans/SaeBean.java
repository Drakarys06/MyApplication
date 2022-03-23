package com.example.myapplication.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaeBean {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("cours")
    @Expose
    private String cours;
    @SerializedName("td")
    @Expose
    private String td;
    @SerializedName("tp")
    @Expose
    private String tp;
    @SerializedName("projet")
    @Expose
    private String projet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SaeBean withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public SaeBean withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public SaeBean withCours(String cours) {
        this.cours = cours;
        return this;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public SaeBean withTd(String td) {
        this.td = td;
        return this;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public SaeBean withTp(String tp) {
        this.tp = tp;
        return this;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    public SaeBean withProjet(String projet) {
        this.projet = projet;
        return this;
    }

    @Override
    public String toString() {
        return "SaeBean{" +
                "id=" + id +
                ", nom=" + nom +
                ", cours=" + cours +
                ", td=" + td +
                ", tp=" + tp +
                ", projet=" + projet +
                '}';
    }
}
