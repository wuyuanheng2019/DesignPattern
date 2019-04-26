package com.wyh.designpattern.strategy.service.impl;

import com.wyh.designpattern.enums.BeanNameEnums;
import com.wyh.designpattern.strategy.Pattern.PromotionAssembly;
import com.wyh.designpattern.strategy.entity.Order;
import com.wyh.designpattern.strategy.service.OrderService;
import com.wyh.designpattern.util.SpringContextUtil;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    /*1、第一版
       随着促销活动的变化（增加或删除促销策略）switch会越来越庞大
    public Order prepareOrder(Order order, String promotion) {
        switch (promotion) {
            case "promotion-1":
                //促销算法1
                break;
            case "promotion-2":
                //促销算法2
                break;
            //.................
        }
        return order;
    }*/

   /* 2、第二版
         算法部分提出，解耦，但是类会略来越庞大，switch的问题并没有解决
    public Order prepareOrder(Order order, String promotion) {
        switch (promotion) {
            case "promotion-1":
                return calPromotion1(order);
            case "promotion-2":
                return calPromotion2(order);
            //.................
        }
        return order;
    }

    private Order calPromotion1(Order order) {
        //TODO 逻辑
        return order;
    }

    private Order calPromotion2(Order order) {
        //TODO 逻辑
        return order;
    }*/


    @Override
    public Order prepareOrder(Order order, String promotion) {
        /*
           使用策略模式最大的好处：降低耦合
           基础算法进行拆分，每个促销活动进行拆分
           在这里结合了spring容器来实现（使用反射的原理），这里也可以结合Map，或者结合xml注解的形式来实现
         */
        String beanName = BeanNameEnums.getBeanNameByPromotion(promotion);
        PromotionAssembly promotionAssembly = (PromotionAssembly) SpringContextUtil.getBean(beanName);
        return promotionAssembly.prepareOrder(order);
    }
}
