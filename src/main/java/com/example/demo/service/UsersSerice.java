package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;

public interface UsersSerice {

    //查询所有用户
    List<Users> selectall();

    //用户新增
    int addnew(Users users);

    //删除用户
    int delete(int id);

    //修改用户
    int  update(Users users);

    //显示单个用户
    Users selectone(Users users);

    //通过姓名查看用户名不能重名
    Users selectByName(Users users);

    //swagger的模糊查询
    List<Users> swaggerSelect(Users  users);
}
