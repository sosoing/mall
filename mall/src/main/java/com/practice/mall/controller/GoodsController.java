package com.practice.mall.controller;

import com.practice.mall.pojo.Goods;
import com.practice.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/Goods")
    public List<Goods> getGoods(){
        return goodsService.getGoods();
    }

    @GetMapping("/Goods/GoodsName")
    public List<Goods> getGoodsByName(String goodsname){
        return goodsService.getGoodsByGoodsName(goodsname);
    }

    @GetMapping("/Goods/GoodsTag")
    public List<Goods> getGoodsByTag(String tag){
        return goodsService.getGoodsByTag(tag);
    }



}
