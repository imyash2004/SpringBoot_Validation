package com.practice.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
    @NotBlank(message = "User name can not be empty")
    @Size(max = 12,min = 3,message = "User name must be in between 3 to 12 characteer")
    private String userName;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message="Invalid email")
    private String email;
    @AssertTrue
    private boolean aggred;

    public LoginData(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public LoginData() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAggred() {
        return aggred;
    }

    public void setAggred(boolean aggred) {
        this.aggred = aggred;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
