package com.practice.mall;

import com.practice.mall.mapper.OrderMapper;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallApplicationTests {
//    @Autowired
//    private TestMapper testMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

//    @Test
//    public void testuserlist(){
//        List<Employee> employeeList=testMapper.list();
//        employeeList.stream().forEach(employee->{
//            System.out.println(employee);
//        });

//    }

    @Test
    void testGetOrder(){
        com.practice.mall.pojo.Order order=orderMapper.getOrderByOrderNo("a1");
        System.out.println(order.getOrderCreateTime());
        System.out.println(order.getOrderId());
    }

}
