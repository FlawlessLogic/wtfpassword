package com.wtfismypassword.demo.controllers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Entity
public class WebInfo {

    @Id
    @GeneratedValue
    int id;

    @NotNull
    String websiteName;

    //This will be a unique identifier
    @NotNull
    String websiteAddress;

    String hint;

    ArrayList<PasswordRequirementType> passwordRequirements;

    ArrayList<UsernameRequirement> usernameRequirements;

    public WebInfo() { }

    // This is just an easy break between stuff and getters and setters

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public ArrayList<UsernameRequirement> getUsernameRequirements() {
        return usernameRequirements;
    }

    public void setUsernameRequirements(ArrayList<UsernameRequirement> usernameRequirements) {
        this.usernameRequirements = usernameRequirements;
    }

    public ArrayList<PasswordRequirementType> getPasswordRequirements() {
        return passwordRequirements;
    }

    public void setPasswordRequirements(ArrayList<PasswordRequirementType> passwordRequirements) {
        this.passwordRequirements = passwordRequirements;
    }

    public int getId() {
        return id;
    }
}
