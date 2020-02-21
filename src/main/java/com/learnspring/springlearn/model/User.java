package com.learnspring.springlearn.model;

public class User {

    private String name;
    private String email;

    public User(String names) {
        this.name = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
