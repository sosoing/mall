package com.practice.mall.utils;

import java.util.Random;

public class OrderNoUtils {
    public static String generateOrderNo() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        /*随机产生订单编号，以2位为例*/
        for (int i = 0; i < 2; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
