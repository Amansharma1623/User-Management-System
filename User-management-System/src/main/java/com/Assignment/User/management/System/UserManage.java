package com.Assignment.User.management.System;

public class UserManage {

    private Integer UserId;
    private String Name;
    private String UserName;
    private String Address;
    private Integer Number;

    public UserManage(Integer UserId, String Name, String UserName, String Address, Integer Number) {
        this.UserId = UserId;
        this.Name = Name;
        this.UserName = UserName;
        this.Address = Address;
        this.Number = Number;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer Number) {
        this.Number = Number;
    }
}
