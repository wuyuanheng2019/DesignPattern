package com.wyh.designpattern.single.hungry;

public class Singleton {

    //使用静态变量完成类的创建
    private final static Singleton INSTANCE = new Singleton();

    /*
    //使用静态代码块完成类的创建
    private static Singleton instance;
    static {
        instance = new Singleton();
    }*/

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
