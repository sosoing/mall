package com.practice.mall.service.impl;

import com.practice.mall.mapper.UserMapper;
import com.practice.mall.pojo.User;
import com.practice.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void creatUser(User user) {
        userMapper.creatUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);

    }

    @Override
    public List<User> getAdminUser() {
        return userMapper.getAdminUser();
    }

    @Override
    public List<User> getCustomer() {
        return userMapper.getCustomer();
    }

    @Override
    public User getUserByUserName(String username) {
        return userMapper.queryUser(username);
    }

    @Override
    public void login(User user) {
        userMapper.login(user);

    }
}
