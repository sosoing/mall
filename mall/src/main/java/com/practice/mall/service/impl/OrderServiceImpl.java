package com.practice.mall.service.impl;

import com.practice.mall.mapper.GoodsMapper;
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
    @Autowired
    private GoodsMapper goodsMapper;

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
        /*订单部分*/
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
        order.setOrderCreateTime(new Date());
        order.setUpdateTime(new Date());
        orderMapper.insertOrder(order);
        /*订单商品部分*/
        List<OrderItem> orderItemList=new ArrayList<>();
        for (int i = 0; i < shoppingCart.getShoppingItemList().size(); i++) {
            OrderItem orderItem=new OrderItem();
            orderItem.setOrderId(orderMapper.getOrderByOrderNo(orderNo).getOrderId());
            orderItem.setGoodsId(shoppingCart.getShoppingItemList().get(i).getGoodsId());
            orderItem.setGoodsImg(goodsMapper.queryGoodsById(shoppingCart.getShoppingItemList().get(i).getGoodsId()).getGoodsImg());
            orderItem.setSellingPrice(goodsMapper.queryGoodsById(shoppingCart.getShoppingItemList().get(i).getGoodsId()).getGoodsNowPrice());
            orderItem.setGoodsNum(shoppingCart.getShoppingItemList().get(i).getGoodsNum());
            orderItem.setCreateTime(new Date());
            orderItem.setUpdateTime(new Date());
            orderItemList.add(orderItem);

        }
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
