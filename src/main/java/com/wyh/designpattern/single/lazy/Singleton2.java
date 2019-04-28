package com.wyh.designpattern.single.lazy;

public class Singleton2 {
    private static volatile Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            //在这里提高了效率，锁在了方法中，而不是方法上面
            synchronized (Singleton.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
