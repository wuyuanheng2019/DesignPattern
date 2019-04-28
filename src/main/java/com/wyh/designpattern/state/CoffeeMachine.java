package com.wyh.designpattern.state;

/**
 * 状态模式：
 * 一个类对外提供了多个行为，同时该类对象拥有多个状态，不同
 * 状态下对外的行为也表现不同，如何灵活扩展
 * 例：咖啡机 咖啡机拥有多个状态，对应的购买者也拥有多个行为
 */
public class CoffeeMachine {
    //没有支付
    final static int NO_PAY = 0;
    //支付
    final static int PAY = 1;
    //售出咖啡
    final static int SOLD = 2;
    //售完（没有库存）
    final static int SOLD_OUT = 4;

    //状态（默认为售完）
    private int state = SOLD_OUT;

    //库存
    private int store;

    public CoffeeMachine(int store) {
        this.store = store;
        //如果库存大于0,则正常
        if (this.store > 0) {
            this.state = NO_PAY;
        }
    }

    //支付行为
    public void pay() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("支付成功，请确定购买咖啡。");
                this.state = PAY;
                break;
            case PAY:
                System.out.println("已支付成功，请确定购买咖啡。");
                break;
            case SOLD:
                System.out.println("不可支付，已购买请取用咖啡！");
                break;
            case SOLD_OUT:
                System.out.println("咖啡已售罄，不可购买！");
        }
    }

    //退款行为
    public void refund() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("你尚未支付，请不要乱按！");
                break;
            case PAY:
                System.out.println("退款成功！");
                this.state = NO_PAY;
                break;
            case SOLD:
                System.out.println("已购买，请取用！");
                break;
            case SOLD_OUT:
                System.out.println("咖啡已售罄，不可购买！");
        }
    }

    public void buy() {
        //购买咖啡
    }

    //打开阀门
    public void getCoffee() {
        //获取咖啡
    }

    /*
    如果拥有多种状态呢？同时增加多种行为呢？ 这样写是非常不易于扩展的
    隔离变化，抽出不会变化的
    在这里不妨换一种思路：把状态提取出来，每一种状态拥有多种行为（由原来的每一种行为中判断多个状态）
    如果新增加行为，那么多增加方法，如果新增加状态，那么可以新增加实现，这样实现了最小的变化
     */
}
