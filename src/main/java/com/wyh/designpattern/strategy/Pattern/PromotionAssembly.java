package com.wyh.designpattern.strategy.Pattern;

import com.wyh.designpattern.strategy.entity.Order;

public interface PromotionAssembly {

    /**
     * 计算订单金额
     * 在这里可以拆分算法，把基础的算法实现
     * 类似的实现思路：mapper-service的设计理念
     *
     * @param order 订单
     * @return 订单
     */
    Order prepareOrder(Order order);
}
