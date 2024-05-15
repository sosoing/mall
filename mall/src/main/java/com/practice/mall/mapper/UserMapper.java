package com.practice.mall.mapper;

import com.practice.mall.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void login(String userLoginAccount,String userLoginPassword);
    void creatUser(Integer userId,String userName,String userLoginAccount,String userLoginPassword);
    void deleteUser(Integer userId);
    void updateUser(User user);
}
