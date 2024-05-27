package com.practice.mall.service.impl;

import com.practice.mall.mapper.OrderMapper;
import com.practice.mall.pojo.*;
import com.practice.mall.service.OrderService;
import com.practice.mall.utils.OrderNoUtils;
import com.practice.mall.utils.SaveOrderItemUtils;
import com.practice.mall.utils.SaveOrderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void updateOrder(Order order,List<OrderItem> orderItemList) {
        order.setUpdateTime(new Date());
        orderMapper.updateOrder(order);
        for (int i = 0; i < orderItemList.size(); i++) {
            orderItemList.get(i).setUpdateTime(new Date());
            orderMapper.updateOrderItem(orderItemList.get(i));
        }
    }

    @Override
    public void saveOrder(User user, ShoppingCart shoppingCart) {
        Order order=SaveOrderUtils.saveOrder(user,shoppingCart);
        orderMapper.insertOrder(order);
        List<OrderItem> orderItemList= SaveOrderItemUtils.saveOrderItem(order.getOrderNo(),shoppingCart);
        for (OrderItem orderItem : orderItemList) {
            orderMapper.insertOrderItem(orderItem);
        }


    }

    @Override
    public Order getOrderByOrderNo(String orderNo) {
        return orderMapper.getOrderByOrderNo(orderNo);
    }

    @Override
    public List<OrderItem> getOrderItem(String orderNo) {
        Order order=orderMapper.getOrderByOrderNo(orderNo);
        return orderMapper.getOrderItemByOrderId(order.getOrderId());
    }

    @Override
    public void cancelOrder(String orderNo) {
        orderMapper.cancelOrder(orderNo);
        Order order=orderMapper.getOrderByOrderNo(orderNo);
        orderMapper.deleteOrderItem(order.getOrderId());
    }
}
