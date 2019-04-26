package com.wyh.designpattern.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 订单金额
     */
    private BigDecimal mony;
}
