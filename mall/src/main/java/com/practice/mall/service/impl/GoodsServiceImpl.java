package com.practice.mall.service.impl;

import com.practice.mall.mapper.GoodsMapper;
import com.practice.mall.pojo.Goods;
import com.practice.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoods() {
        return goodsMapper.getGoodsList();
    }

    @Override
    public List<Goods> getGoodsByGoodsName(String goodsname) {
        return goodsMapper.queryGoodsByName(goodsname);
    }

    @Override
    public List<Goods> getGoodsByTag(String tag) {
        return goodsMapper.queryGoodsByTag(tag);
    }
}
