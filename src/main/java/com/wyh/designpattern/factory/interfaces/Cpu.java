package com.wyh.designpattern.factory.interfaces;

public interface Cpu {
    void run();

    /**
     * 使用内部类
     * 工厂设计模式，这里实现所有cpu的型号
     */
    class Cpu650 implements Cpu{

        @Override
        public void run() {
            System.out.println("Cpu650");
        }
    }

    class Cpu670 implements Cpu{

        @Override
        public void run() {
            System.out.println("Cpu670");
        }
    }
}
