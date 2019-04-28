package com.wyh.designpattern.agent.dynamicPoxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

    private Object target;

    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 前置增强
        doSomethingBefore();
        // 返回值
        Object res = null;
        // 调用父类的该方法，当是生成接口的代理时不可调用。
        //Object res = methodProxy.invokeSuper(proxy, args);
        // 通过method来调用被代理对象的方法
        if (this.target != null) {
            res = method.invoke(target, args);
        }
        // 后置增强
        doSomethingAfter();
        return res;
    }

    private void doSomethingBefore() {
        System.out.println("我是cglib的前置增强！");
    }

    private void doSomethingAfter() {
        System.out.println("我是cglib的后置增强");
    }
}
