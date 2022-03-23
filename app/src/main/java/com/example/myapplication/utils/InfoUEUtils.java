package com.example.myapplication.utils;

import com.example.myapplication.beans.UEBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class InfoUEUtils {
    public static ArrayList<UEBean> loadUE(Integer idBut, Integer idUE) throws Exception {
        //Requete avec OKHttpUtils
        String url = "http://infort.gautero.fr/index2022.php?action=get&obj=ue&idBut=" + idBut + "&idUe=" + idUE;
        String json = OkHttpUtils.sendGetOkHttpRequest(url);
        //Parser le JSON avec le bon bean et GSON
        ArrayList<UEBean> listData = new Gson().fromJson(json, new TypeToken<ArrayList<UEBean>>() {}.getType());
        //Retourner la donnée
        return listData;
    }
}
