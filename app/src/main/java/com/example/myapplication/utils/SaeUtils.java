package com.example.myapplication.utils;

import com.example.myapplication.beans.SaeBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class SaeUtils {
    public static ArrayList<SaeBean> loadUE(Integer idUE) throws Exception {
        //Requete avec OKHttpUtils
        String url = "http://infort.gautero.fr/index2022.php?action=get&obj=sae&idUe=" + idUE;
        String json = OkHttpUtils.sendGetOkHttpRequest(url);
        //Parser le JSON avec le bon bean et GSON
        ArrayList<SaeBean> listData = new Gson().fromJson(json, new TypeToken<ArrayList<SaeBean>>() {}.getType());
        //Retourner la donnée
        return listData;
    }
}
