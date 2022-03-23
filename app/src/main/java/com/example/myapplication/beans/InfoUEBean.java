package com.example.myapplication.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class InfoUEBean {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InfoUEBean withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public InfoUEBean withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public InfoUEBean withCours(String cours) {
        this.cours = cours;
        return this;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public InfoUEBean withTd(String td) {
        this.td = td;
        return this;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public InfoUEBean withTp(String tp) {
        this.tp = tp;
        return this;
    }
    @Override
    public String toString() {
        return "UEBean{" +
                "id=" + id +
                ", nom=" + nom +
                ", cours=" + cours +
                ", td=" + td +
                ", tp=" + tp +
                '}';
    }
}
