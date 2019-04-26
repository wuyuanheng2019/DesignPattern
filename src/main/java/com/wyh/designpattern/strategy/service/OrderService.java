package com.wyh.designpattern.strategy.service;

import com.wyh.designpattern.strategy.entity.Order;

public interface OrderService {
    /**
     * 根据选择不同的促销策略，来计算订单金额
     *
     * @param order     订单
     * @param promotion 促销策略
     * @return 订单
     */
    Order prepareOrder(Order order, String promotion);
}
