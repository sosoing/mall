package com.practice.mall.service;

import com.practice.mall.pojo.Order;
import com.practice.mall.pojo.OrderItem;
import com.practice.mall.pojo.ShoppingItem;
import com.practice.mall.pojo.User;

import java.util.List;

public interface OrderService {

    void updateOrder(Order order);

    void saveOrder(User user, List<ShoppingItem> shoppingItemList);

    Order getOrderByOrderNo(String orderNo);

    List<OrderItem> getOrderItem(String orderNo);

    void cancelOrder(String orderNo, Integer userId);

}
