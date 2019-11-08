package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Users实体类",reference = "参考")
public class Users {
    @ApiModelProperty(value = "用户id",dataType = "int",required = true,example = "1")
    private int usersid;

    @ApiModelProperty(value = "用户姓名",dataType = "String",required = true,example = "user")
    private String usersname;

    @ApiModelProperty(value = "用户性别",dataType = "String",required = true,example = "男")
    private String userssex;

    @ApiModelProperty(value = "用户年龄",dataType = "int",required = true,example = "11")
    private int usersage;

    public int getUsersid() {
        return usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getUserssex() {
        return userssex;
    }

    public void setUserssex(String userssex) {
        this.userssex = userssex;
    }

    public int getUsersage() {
        return usersage;
    }

    public void setUsersage(int usersage) {
        this.usersage = usersage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "usersid=" + usersid +
                ", usersname='" + usersname + '\'' +
                ", userssex='" + userssex + '\'' +
                ", usersage=" + usersage +
                '}';
    }

    public Users(int usersid, String usersname, String userssex, int usersage) {
        this.usersid = usersid;
        this.usersname = usersname;
        this.userssex = userssex;
        this.usersage = usersage;
    }

    public Users() {
    }
}
