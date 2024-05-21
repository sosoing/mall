package com.practice.mall.service;

import com.practice.mall.pojo.CartGoods;

import java.util.List;

public interface ShoppingCartService {

    void addGoodsInCart(CartGoods cartGoods);
    void updateGoodsInCart(CartGoods cartGoods);
    void deleteGoodsInCart(CartGoods cartGoods);
    List<CartGoods> getGoodsInCart(Integer userId);



}
