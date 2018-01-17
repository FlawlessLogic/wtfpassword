package com.wtfismypassword.demo.controllers.models;

import java.util.HashMap;

public enum PasswordRequirementType {
    LENGTH6("Password must be at least 6 characters in length"),
    LENGTH8("Password must be at least 8 characters in length"),
    UPPER("Password must contain an uppercase letter"),
    LOWER("Password must contain a lowercase letter"),
    NUMBER("Password must contain a number"),
    SPECIAL("Password must contain a special character"),
    DIFFERENT("Password must be different from previous passwords"),
    OTHER("Password can be whatever you want");

    private final String name;

    PasswordRequirementType(String name){
        this.name = name;
    }

    @Override public String toString()
    {
        return this.name;
    }

    public String getName() {
        return name;
    }
}
