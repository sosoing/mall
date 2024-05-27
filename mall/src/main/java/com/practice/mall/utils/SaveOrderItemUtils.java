package com.practice.mall.utils;

import com.practice.mall.mapper.GoodsMapper;
import com.practice.mall.mapper.OrderMapper;
import com.practice.mall.pojo.OrderItem;
import com.practice.mall.pojo.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaveOrderItemUtils {
    @Autowired
    private static OrderMapper orderMapper;
    @Autowired
    private static GoodsMapper goodsMapper;

    public static List<OrderItem> saveOrderItem(String orderNo,ShoppingCart shoppingCart){
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
        return orderItemList;

    }
}
