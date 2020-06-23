package com.example.usermicroservice.models;

import java.util.List;

public class User {

    private String id;
    private String name;
    private List<UserInfo> userinfo;

    public User() {}

    public User(String id, String name, List<UserInfo> userinfo) {
        this.id = id;
        this.name = name;
        this.userinfo = userinfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserInfo> getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(List<UserInfo> userinfo) {
        this.userinfo = userinfo;
    }
}
