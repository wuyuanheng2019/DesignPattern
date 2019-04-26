package com.wyh.designpattern.decorating;

/**
 * 装设者
 * 在方法中进行实际则增强
 */
public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    public String methodA() {
        /*
         这里可以随意的组装算法
         */
        System.out.println("方法A增强");
        return this.component.methodA();
    }

    public int methodB() {
        /*
         这里可以随意的组装算法
         */
        System.out.println("方法B增强");
        return this.component.methodB();
    }
}
