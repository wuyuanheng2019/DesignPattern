package com.wyh.designpattern.decorating;

/**
 * 被装饰着（装饰者和被装饰者都要实现规定行为的接口）
 */
public class ConcreteComponent implements Component {

    @Override
    public String methodA() {
        return "concrete-object";
    }

    @Override
    public int methodB() {
        return 100;
    }
}
