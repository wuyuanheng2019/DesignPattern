package com.wyh.designpattern.single.lazy;

public class Singleton3 {
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    //这里也可以使用静态内部类实现
    private static class SingletonInstance {
        //避免了线程不安全的问题，延迟加载，效率比较高
        //类的属性会在第一次延迟加载的时候初始化，jvm帮我们保证了线程安全的问题
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
