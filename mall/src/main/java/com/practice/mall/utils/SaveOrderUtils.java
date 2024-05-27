package com.practice.mall.utils;

import com.practice.mall.mapper.OrderMapper;
import com.practice.mall.pojo.Order;
import com.practice.mall.pojo.ShoppingCart;
import com.practice.mall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class SaveOrderUtils {
    @Autowired
    private static OrderMapper orderMapper;

    public static Order saveOrder(User user,ShoppingCart shoppingCart){
        Order order=new Order();
        String orderNo=OrderNoUtils.generateOrderNo();
        while (orderMapper.getOrderByOrderNo(orderNo)!=null){
            orderNo=OrderNoUtils.generateOrderNo();
        }
        order.setOrderNo(orderNo);
        order.setCustomerId(shoppingCart.getCustomerId());
        order.setTotalPrice(shoppingCart.getTotalPrice());
        order.setPayStatus((byte) 0);
        order.setOrderStatus((byte) 0);
        order.setCustomerAddress(user.getAddress());
        order.setOrderCreatTime(new Date());
        order.setUpdateTime(new Date());
        return order;


    }
}
