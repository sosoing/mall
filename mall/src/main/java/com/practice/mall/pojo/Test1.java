package com.practice.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*暂时方便前后端协调而创，后期需要优化*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test1 {
    private Order order;
    private List<OrderItem> orderItemList;
}
