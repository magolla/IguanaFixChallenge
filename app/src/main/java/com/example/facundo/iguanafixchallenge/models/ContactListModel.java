package com.example.facundo.iguanafixchallenge.models;

/**
 * Created by facundo on 26/09/17.
 */


import java.util.List;

public class ContactListModel {

    private String lastName;
    private String createdAt;
    private String birthDate;
    private String firstName;
    private String photo;
    private List<PhoneModel> phones;
    private String thumb;
    private String userId;

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String value) { this.birthDate = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getPhoto() { return photo; }
    public void setPhoto(String value) { this.photo = value; }


    public String getThumb() { return thumb; }
    public void setThumb(String value) { this.thumb = value; }

    public String getUserId() { return userId; }
    public void setUserId(String value) { this.userId = value; }

    public List<PhoneModel> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneModel> phones) {
        this.phones = phones;
    }
}

