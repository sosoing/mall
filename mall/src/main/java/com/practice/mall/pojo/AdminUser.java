package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminUser {
    private Integer adminUserId;
    private String adminUserName;
    private String adminUserLoginAccount;
    private String adminUserLoginPassword;

}
