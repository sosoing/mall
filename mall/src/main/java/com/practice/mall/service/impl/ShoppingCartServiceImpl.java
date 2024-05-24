package com.practice.mall.service.impl;

import com.practice.mall.mapper.GoodsMapper;
import com.practice.mall.mapper.ShoppingCartMapper;
import com.practice.mall.pojo.CartGoods;
import com.practice.mall.pojo.ShoppingItem;
import com.practice.mall.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public void addGoodsInCart(CartGoods cartGoods) {
        shoppingCartMapper.insertGoodsInCart(cartGoods);

    }

    @Override
    public void updateGoodsInCart(CartGoods cartGoods) {
        shoppingCartMapper.updateGoodsInCart(cartGoods);

    }

    @Override
    public void deleteGoodsInCart(CartGoods cartGoods) {
        shoppingCartMapper.deleteGoodsInCart(cartGoods);

    }

    @Override
    public List<ShoppingItem> getGoodsInCart(Integer userId) {
        return shoppingCartMapper.getGoodsInCartList(userId);
    }
}
