package com.practice.mall.service;

import com.practice.mall.pojo.*;

import java.util.List;

public interface OrderService {

    void updateOrder(Order order,List<OrderItem> orderItemList);

    void saveOrder(User user, ShoppingCart shoppingCart);

    Order getOrderByOrderNo(String orderNo);

    List<OrderItem> getOrderItem(String orderNo);

    void cancelOrder(String orderNo);

}
