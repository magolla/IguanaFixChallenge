package com.example.facundo.iguanafixchallenge.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by facundo on 26/09/17.
 */

public class ApiClient {

    private static Endpoint service = null;
    private static String API_URL = "https://private-d0cc1-iguanafixtest.apiary-mock.com";

    public static Endpoint getClient(Context context) {
        if (service==null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(Endpoint.class);
        }
        return service;
    }

}
