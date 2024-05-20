package com.practice.mall.controller;

import com.practice.mall.pojo.User;
import com.practice.mall.service.UserService;
import com.practice.mall.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        User user1=userService.login(user);
        if (user1!=null){
            Map<String,Object> claims=new HashMap<>();
            claims.put("userId",user1.getUserId());
            claims.put("userName",user1.getUserName());
            claims.put("userLoginAccount",user1.getUserLoginAccount());
            claims.put("userLoginPassword",user1.getUserLoginPassword());
            claims.put("identityId",user1.getIdentityId());
            String jwt= JwtUtils.generateJwt(claims);
            return jwt;
        }
        return "登陆失败";

    }
}
