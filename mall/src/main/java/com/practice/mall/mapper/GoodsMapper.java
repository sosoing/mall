package com.practice.mall.mapper;

import com.practice.mall.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> getGoodsList();
    List<Goods> queryGoodsByName(String goodsName);
    List<Goods> queryGoodsByTag(String tag);

}
