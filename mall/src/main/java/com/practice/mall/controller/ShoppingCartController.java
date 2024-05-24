package com.practice.mall.controller;

import com.practice.mall.pojo.CartGoods;
import com.practice.mall.pojo.ShoppingItem;
import com.practice.mall.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/ShoppingCart")
    public void addGoods(@RequestBody CartGoods cartGoods){
        shoppingCartService.addGoodsInCart(cartGoods);
    }
    @PutMapping("/ShoppingCart")
    public void updateShoppingCart(@RequestBody CartGoods cartGoods){
        shoppingCartService.updateGoodsInCart(cartGoods);
    }
    @DeleteMapping("/ShoppingCart")
    public void deleteGoodsInShoppingCart(@RequestBody CartGoods cartGoods){
        shoppingCartService.deleteGoodsInCart(cartGoods);
    }
    @GetMapping("/ShoppingCart/{userId}")
    public List<ShoppingItem> geiShoppingCart(Integer userId){
        return shoppingCartService.getGoodsInCart(userId);
    }





}
