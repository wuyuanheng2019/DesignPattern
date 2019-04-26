package com.wyh.designpattern.decorating;

/**
 * 共同的需要装饰的行为定义的接口
 * 不改变具体类的代码，动态增强行为功能
 * 参考策略模式，如果某个策略要改变，添加其他几个策略 ，首先相邀继承的关系
 * 随着功能的庞大，类图会越来越复杂，使用装饰者模式，就可以迎刃而解
 */
public interface Component {

    String methodA();

    int methodB();
}
