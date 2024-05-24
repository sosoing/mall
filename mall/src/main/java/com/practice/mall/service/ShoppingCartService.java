package com.practice.mall.service;

import com.practice.mall.pojo.CartGoods;
import com.practice.mall.pojo.ShoppingItem;

import java.util.List;

public interface ShoppingCartService {

    void addGoodsInCart(CartGoods cartGoods);
    void updateGoodsInCart(CartGoods cartGoods);
    void deleteGoodsInCart(CartGoods cartGoods);
    List<ShoppingItem> getGoodsInCart(Integer userId);



}
