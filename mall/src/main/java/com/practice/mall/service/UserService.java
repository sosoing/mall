package com.practice.mall.service;

import com.practice.mall.pojo.User;

import java.util.List;

public interface UserService {
    void creatUser(User user);
    void deleteUser(Integer userId);
    void updateUser(User user);
    List<User> getAdminUser();
    List<User> getCustomer();
    User getUserByUserName(String username);
    void login(String loginname,String password);


}
