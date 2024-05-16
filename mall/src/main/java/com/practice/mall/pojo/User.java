package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String userLoginAccount;
    private String userLoginPassword;
    private Byte identityId; /*用户识别id，1是商家，2是顾客*/

}
