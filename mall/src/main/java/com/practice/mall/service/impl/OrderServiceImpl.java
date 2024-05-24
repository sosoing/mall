package com.practice.mall.service.impl;

import com.practice.mall.pojo.Order;
import com.practice.mall.pojo.OrderItem;
import com.practice.mall.pojo.ShoppingItem;
import com.practice.mall.pojo.User;
import com.practice.mall.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public void saveOrder(User user, List<ShoppingItem> shoppingItemList) {

    }

    @Override
    public Order getOrderByOrderNo(String orderNo) {
        return null;
    }

    @Override
    public List<OrderItem> getOrderItem(String orderNo) {
        return null;
    }

    @Override
    public void cancelOrder(String orderNo, Integer userId) {

    }
}
