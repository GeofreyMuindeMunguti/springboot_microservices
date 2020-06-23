package com.example.usermicroservice.models;

public class UserInfo {

    private String comments;

    public UserInfo() {

    }

    public UserInfo(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
