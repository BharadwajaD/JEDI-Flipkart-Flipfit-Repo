package com.flipfit.bean;


import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty
    private long userId;

    @JsonProperty
    private String userName;

    @JsonProperty
    private String hashPassword;

    @JsonProperty
    private String role;

    public User(int userId, String userName, String role) {

        this.userId = userId;
        this.userName = userName;
        this.role = role;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
};
