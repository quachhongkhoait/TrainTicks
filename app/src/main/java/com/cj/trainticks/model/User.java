package com.cj.trainticks.model;

import androidx.room.PrimaryKey;

public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int cmnd;
    private String email;
    private String phone;
    private String object;

    public User(int id, String name, int cmnd, String email, String phone, String object) {
        this.id = id;
        this.name = name;
        this.cmnd = cmnd;
        this.email = email;
        this.phone = phone;
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
