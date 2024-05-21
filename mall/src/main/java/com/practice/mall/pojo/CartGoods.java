package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartGoods {
    private Integer userId;
    private Integer goodsId;
    private Integer goodsNum;
}
