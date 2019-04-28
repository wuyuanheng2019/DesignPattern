package com.wyh.designpattern.agent.staticPoxy;

/**
 * 静态代理的类图和装设者设计模式的类图是一样的
 * 区别：意图不同，代理模式意在代理中控制使用者对目标对象的访问，
 * 以及进行功能增强
 */
public interface Girl {

    /**
     * 代理类和被代理类都需要实现的接口，增强
     *
     * @param length 身高
     * @return 是否可以相遇
     */
    boolean dating(float length);
}
