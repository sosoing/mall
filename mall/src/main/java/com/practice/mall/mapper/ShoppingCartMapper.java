package com.practice.mall.mapper;

import com.practice.mall.pojo.CartGoods;
import com.practice.mall.pojo.ShoppingItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    void insertGoodsInCart(CartGoods cartGoods);
    void updateGoodsInCart(CartGoods cartGoods);
    void deleteGoodsInCart(CartGoods cartGoods);
    List<ShoppingItem> getGoodsInCartList(Integer userId);
}
