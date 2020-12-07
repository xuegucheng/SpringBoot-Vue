package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * UserService
 *
 * @author XueGuCheng
 * @create 2020-12-07 21:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryPage(Integer startRows) {
        return userMapper.queryPage(startRows);
    }

    @Override
    public int getRowCount() {
        return userMapper.getRowCount();
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> findUserByName(String userName) {
        return userMapper.findUserByName(userName);
    }

    @Override
    public List<User> ListUser(){
        return userMapper.ListUser();
    }

    @Override
    public int Update(User user){
        return userMapper.Update(user);
    }

    @Override
    public int delete(int userId){
        return userMapper.delete(userId);
    }



}
