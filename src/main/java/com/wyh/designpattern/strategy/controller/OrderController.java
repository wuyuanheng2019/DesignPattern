package com.wyh.designpattern.strategy.controller;

import com.wyh.designpattern.strategy.entity.Order;
import com.wyh.designpattern.strategy.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Api(value = "OrderController", tags = {"策略模式接口文档"})
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 计算订单的促销金额
     */
    @PostMapping("prepare")
    public Order prepareOrder(Order order, String promotion) {
        return this.orderService.prepareOrder(order, promotion);
    }
}
