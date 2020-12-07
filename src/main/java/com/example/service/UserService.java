package com.example.service;

import com.example.vo.User;

import java.util.List;

/**
 * 描述:
 * service
 *
 * @author XueGuCheng
 * @create 2020-12-07 21:48
 */
public interface UserService {

    public List<User> findUserByName(String userName);

    public List<User> ListUser();

    public List<User> queryPage(Integer startRows);

    public int getRowCount();

    public int insertUser(User user);

    public int delete(int userId);

    public int Update(User user);

}
