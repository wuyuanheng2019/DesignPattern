package com.wyh.designpattern.bridging;

public class Rect extends Shape {
    /**
     * 实现颜色
     */
    @Override
    public void doing() {
        System.out.println("我是绿色");
    }

    /**
     * 实现形状
     */
    public void draw() {
        System.out.println("我是方形");
    }

    /*
      从多个方面去抽象出来变与不变
     */
}
