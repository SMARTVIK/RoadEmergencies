package com.roadsideemergencies.vik.roademergencies.models;

import java.util.Random;

/**
 * Created by vik on 9/4/17.
 */

public class Contact {
    private static int BASE_ID = 10000;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String name;
    private String phoneNumber;
    private int id;
    private int userId;

    public Contact(String name, String phoneNumber, int userId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = getUniqueId();
        this.userId = userId;
    }

    public Contact(int id) {
        this.id = id;
    }

    private int getUniqueId() {
        return BASE_ID++ + new Random().nextInt(100000);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }
}
