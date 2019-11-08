package com.example.demo.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User实体类",reference = "参考")
public class User {

    //用户名
    @ApiModelProperty(value = "管理员姓名",dataType = "String",required = true,example = "admins")
    private String username;
    //用户密码
    @ApiModelProperty(value = "管理员密码",dataType = "String",required = true,example = "111111")
    private String userpwd;
    //用户性别
    @ApiModelProperty(value = "性别",dataType = "String",required = true,example = "男")
    private String usersex;
    //用户年龄
    @ApiModelProperty(value = "年龄",dataType = "String",required = true,example = "11")
    private  String userage;

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

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
                ", usersex='" + usersex + '\'' +
                ", userage=" + userage +
                '}';
    }

    //有参构造
    public User(String username, String userpwd, String usersex, String userage) {
        this.username = username;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.userage = userage;
    }

    //无参构造
    public User() {
    }
}
