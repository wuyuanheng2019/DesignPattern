package com.wyh.designpattern.template;

public class Play {
    public static void main(String[] args) {


        //在这里不同的游戏实现相同的方法，处理不同的逻辑代码
        Football football = new Football();
        football.initialize();
        football.startPlay();
        football.endPlay();
    }
}
