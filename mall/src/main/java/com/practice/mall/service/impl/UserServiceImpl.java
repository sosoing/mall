package com.practice.mall.service.impl;

import com.practice.mall.pojo.User;
import com.practice.mall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void creatUser(User user) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAdminUser() {
        return null;
    }

    @Override
    public List<User> getCustomer() {
        return null;
    }

    @Override
    public User getUserByUserName(String username) {
        return null;
    }

    @Override
    public void login(String loginname, String password) {

    }
}
