package com.example.activityservice.models;

public class UserInfo {

    private String id;
    private String comments;

    public UserInfo() {

    }

    public UserInfo(String id, String comments) {
        this.id = id;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
