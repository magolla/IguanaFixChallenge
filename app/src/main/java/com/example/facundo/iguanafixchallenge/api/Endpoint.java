package com.example.facundo.iguanafixchallenge.api;

import com.example.facundo.iguanafixchallenge.models.ContactListModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by facundo on 26/09/17.
 */

public interface Endpoint {

    @GET("/contacts")
    Call<List<ContactListModel>> getContactList();
}
