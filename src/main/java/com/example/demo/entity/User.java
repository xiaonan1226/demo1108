package com.example.demo.entity;


public class User {

    //用户名
    private String username;
    //用户密码
    private String userpwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                '}';
    }

    public User(String username, String userpwd) {
        this.username = username;
        this.userpwd = userpwd;
    }

    public User() {
    }
}
