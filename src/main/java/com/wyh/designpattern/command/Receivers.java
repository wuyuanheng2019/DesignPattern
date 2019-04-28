package com.wyh.designpattern.command;

import java.util.Map;

/**
 * 策略模式和命令模式的区别：
 * 策略模式侧重的是一个行为的多个算法实现，可互换算法
 * 命令模式侧重的是多个行为提供灵活的执行模式
 */
public class Receivers {

    private Map<String, Command> commands;

    public void register(String strComm, Command command) {
        //创建的时候，把对应的命令和执行逻辑放入map中
        commands.put(strComm, command);
    }

    public void receive(String command) {
        Command commandObj = commands.get(command);
        if (commandObj != null) {
            commandObj.execute();
            return;
        }
        System.out.println("不支持此命令" + command);
    }
}
