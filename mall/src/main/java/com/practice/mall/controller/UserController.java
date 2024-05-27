package com.practice.mall.controller;

import com.practice.mall.pojo.User;
import com.practice.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Users")
    public void creat(@RequestBody User user){
        user.setCreatTime(new Date());
        userService.creatUser(user);
    }

    @DeleteMapping("/Users/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PutMapping("/Users/{id}")
    public void update(@PathVariable Integer id,@RequestBody User user){
        user.setUserId(id);
        userService.updateUser(user);
    }

    @GetMapping("/Users/AdminUsers")
    public List<User> getAdminUser(){
        return userService.getAdminUser();
    }

    @GetMapping("/Users/Customers")
    public List<User> getCustomer(){
        return userService.getCustomer();
    }

    @GetMapping("/Users/Query")
    public User QueryUserByName(String name){
        return userService.getUserByUserName(name);
    }

}
