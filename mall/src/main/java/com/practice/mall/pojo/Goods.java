package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Integer goodsNumber;
    private Integer goodsOriginalPrice;
    private Integer goodsNowPrice;
    private String goodsImg;
    private List<String> goodsTag;
    private Byte goodsStatus;

}
