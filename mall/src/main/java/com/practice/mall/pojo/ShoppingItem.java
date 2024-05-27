package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingItem {
    private Integer goodsId;
    private String goodsName;
    private Integer goodsNum;
}
