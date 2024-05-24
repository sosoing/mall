package com.practice.mall.mapper;

import com.practice.mall.pojo.Order;
import com.practice.mall.pojo.OrderItem;
import com.practice.mall.pojo.ShoppingItem;
import com.practice.mall.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    void updateOrder(Order order);
    void updateOrderItem(OrderItem orderItem);
    void insertOrder(Order order);
    void insertOrderItem(OrderItem orderItem);
    Order getOrderByOrderNo(String orderNo);
    List<OrderItem> getOrderItemByOrderNo(Integer orderId);
    void cancelOrder(String orderNo, Integer userId);
    void deleteOrderItem(Integer orderId,Integer goodsId);

}
