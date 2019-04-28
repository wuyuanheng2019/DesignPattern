package com.wyh.designpattern.agent.dynamicPoxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在运行时，动态为不同类的对象创建代理，增强功能，易维护
 * 如果我们使用静态代理，那么要为每一个类都创建一个代理对象，这样维护起来十分棘手
 */
public class MyInvationHandler implements InvocationHandler {

    /**
     * 目标对象：指对谁增强
     */
    private Object target;

    public MyInvationHandler(Object target) {
        this.target = target;
    }

    /**
     * JDK动态代理只对接口创建代理
     *
     * @param proxy  代理对象
     * @param method 方法
     * @param args   参数
     * @return 方法返回参数
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomethingBefore();
        //调用反射，执行方法，这里的方法指的是目标对象的方法
        Object invoke = method.invoke(target, args);
        doSomethingAfter();
        return invoke;
    }

    private void doSomethingBefore() {
        System.out.println("我是前置增强！");
    }

    private void doSomethingAfter() {
        System.out.println("我是后置增强！");
    }
}
