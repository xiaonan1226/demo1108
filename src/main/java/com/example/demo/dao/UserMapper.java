package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    //用户登录
    @Select("select * from t_user where username = #{username} and userpwd = #{userpwd}")
     User login(User User);
}
