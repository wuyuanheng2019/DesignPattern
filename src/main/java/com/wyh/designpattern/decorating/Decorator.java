package com.wyh.designpattern.decorating;

/**
 * 装饰者
 * 中持有被装饰者对象
 */
public class Decorator implements Component {
    /**
     * 定义行为的接口
     */
    protected Component component;

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    @Override
    public String methodA() {
        return this.component.methodA();
    }

    @Override
    public int methodB() {
        return this.component.methodB();
    }
}
