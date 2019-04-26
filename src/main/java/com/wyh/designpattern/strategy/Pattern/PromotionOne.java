package com.wyh.designpattern.strategy.Pattern;

import com.wyh.designpattern.strategy.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class PromotionOne implements PromotionAssembly {

    @Override
    public Order prepareOrder(Order order) {
        System.out.println("我是策略模式一");
        return order;
    }
}
