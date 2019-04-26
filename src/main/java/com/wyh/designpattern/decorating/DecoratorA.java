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
        System.out.println("方法A增强");
        return this.component.methodA();
    }

    public int methodB() {
        System.out.println("方法B增强");
        return this.component.methodB();
    }
}
