package com.example.demo.service.impl;

import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.Users;
import com.example.demo.service.UsersSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersSericeImpl implements UsersSerice {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> selectall() {
        return usersMapper.selectall();
    }

    @Override
    public int addnew(Users users) {
        return usersMapper.addnew(users);
    }

    @Override
    public int delete(int id) {
        return usersMapper.delete(id);
    }

    @Override
    public int update(Users users) {
        return usersMapper.update(users);
    }

    @Override
    public Users selectone(Users users) {
        return usersMapper.selectone(users);
    }

    @Override
    public Users selectByName(Users users) {
        return usersMapper.selectByName(users);
    }

    @Override
    public List<Users> swaggerSelect(Users users) {
        return usersMapper.swaggerSelect(users);
    }
}
