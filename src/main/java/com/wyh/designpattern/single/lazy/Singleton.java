package com.wyh.designpattern.single.lazy;

public class Singleton {
    //使用静态变量定义类
    private static Singleton singleton;

    private Singleton() {
    }

    //在初始化的时候，判断，如果为null，则创建，反之直接获取
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
