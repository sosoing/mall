package com.practice.mall.service;

import com.practice.mall.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoods();
    List<Goods> getGoodsByGoodsName(String goodsname);
    List<Goods> getGoodsByTag(String tag);
}
