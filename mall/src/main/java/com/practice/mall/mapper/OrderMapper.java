package com.practice.mall.mapper;

import com.practice.mall.pojo.Order;
import com.practice.mall.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    void updateOrder(Order order);
    void updateOrderItem(OrderItem orderItem);
    void insertOrder(Order order);
    void insertOrderItem(OrderItem orderItem);
    Order getOrderByOrderNo(String orderNo);
    List<OrderItem> getOrderItemByOrderId(Integer orderId);
    void cancelOrder(String orderNo);
    void deleteOrderItem(Integer orderId);

}
