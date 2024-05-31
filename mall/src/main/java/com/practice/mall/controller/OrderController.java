package com.practice.mall.controller;

import com.practice.mall.mapper.OrderMapper;
import com.practice.mall.pojo.*;
import com.practice.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/Order")
    public Order getOrderByOrderNo(String orderNo){
        return orderService.getOrderByOrderNo(orderNo);
    }

    @GetMapping("/Order/OrderItem")
    public List<OrderItem> getOrderItemByOrderNo(String orderNo){
        return orderService.getOrderItem(orderNo);
    }

    @DeleteMapping("/Order")
    public void cancelOrder(String orderNo){
        orderService.cancelOrder(orderNo);
    }

    @PostMapping("/Order")
    public void saveOrder(@RequestBody Test2 test2){
        orderService.saveOrder(test2.getUser(), test2.getShoppingCart());

    }

    @PutMapping("/Order")
    public void updateOrder(@RequestBody Test1 test1){
        orderService.updateOrder(test1.getOrder(),test1.getOrderItemList());

    }



}
