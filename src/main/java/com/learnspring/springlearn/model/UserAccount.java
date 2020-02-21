package com.learnspring.springlearn.model;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
public class UserAccount {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id;

        @Column(unique = true)
        private String email;

        @Column
        private String password;

        @Column
        private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
