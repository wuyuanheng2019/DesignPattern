package com.wyh.designpattern.strategy.Pattern;

import com.wyh.designpattern.strategy.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class PromotionTwo implements PromotionAssembly {
    @Override
    public Order prepareOrder(Order order) {
        System.out.println("我是策略模式二");
        return order;
    }
}
