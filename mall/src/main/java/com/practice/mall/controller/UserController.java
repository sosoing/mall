package com.practice.mall.controller;

import com.practice.mall.pojo.User;
import com.practice.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Users")
    public void creat(@RequestBody User user){
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

}
