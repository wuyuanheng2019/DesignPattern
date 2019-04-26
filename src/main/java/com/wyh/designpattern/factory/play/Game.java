package com.wyh.designpattern.factory.play;

import com.wyh.designpattern.factory.interfaces.Cpu;
import com.wyh.designpattern.factory.interfaces.Screen;

public class Game {
    public static void main(String[] args) {

        /*
         * 创建子类工厂，得到子类
         */
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        Cpu cpu = xiaoMiFactory.getCpu();
        Screen screen = xiaoMiFactory.getScreen();

        cpu.run();
        screen.size();
    }
}
