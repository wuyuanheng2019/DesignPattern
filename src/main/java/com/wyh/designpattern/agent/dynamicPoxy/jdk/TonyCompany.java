package com.wyh.designpattern.agent.dynamicPoxy.jdk;

import java.lang.reflect.Proxy;

public class TonyCompany {

    /**
     * 代理方法
     *
     * @param target 目标对象
     * @return 返回
     */
    public static Object proxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvationHandler(target));
    }
}
