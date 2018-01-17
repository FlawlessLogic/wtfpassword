package com.wtfismypassword.demo.controllers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsernameRequirement {

    @Id
    @GeneratedValue
    int id;

    public UsernameRequirement() {
    }

    public int getId() {
        return id;
    }
}
