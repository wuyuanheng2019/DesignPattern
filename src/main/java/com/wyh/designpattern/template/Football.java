package com.wyh.designpattern.template;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("我是足球游戏的初始化方法");
    }

    @Override
    protected void startPlay() {
        System.out.println("我是足球游戏的开始方法");
    }

    @Override
    protected void endPlay() {
        System.out.println("我是足球游戏的结束方法");
    }
}
