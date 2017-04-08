package com.roadsideemergencies.vik.roademergencies;

import java.util.Random;

/**
 * Created by vik on 5/4/17.
 */

class User {
    private static  int BASE_ID = 1000;
    private String userName;
    private String password;
    private int id;
    private String createdAt;

    public User(String userName, String password) {
        this.userName=userName;
        this.password=password;
        this.id=getUniqueId();
    }

    public User() {

    }

    private int getUniqueId() {
        return BASE_ID++ + new Random().nextInt(100000);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
