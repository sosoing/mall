package com.practice.mall.mapper;

import com.practice.mall.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User login(User user);
    void creatUser(User user);
    void deleteUser(Integer userId);
    void updateUser(User user);
    User queryUser(String userName);
    List<User> getAdminUser();
    List<User> getCustomer();
}