package com.example.friendlist.Model;

import java.io.Serializable;

public class FriendModel implements Serializable{
    private String name, status, description;
    private int picture;

    public FriendModel(){}

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }


    public FriendModel(String name, String status, int picture, String description){
        this.name = name;
        this.status = status;
        this.picture = picture;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPicture() {
        return picture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
