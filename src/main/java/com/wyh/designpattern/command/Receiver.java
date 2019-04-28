package com.wyh.designpattern.command;

/**
 * 命令模式：
 * 输入一次命令，执行某项功能
 */
public class Receiver {
    public void receive(String command) {
        switch (command) {
            case "command-1":
                //业务逻辑
                break;
            case "command-2":
                //业务逻辑
                break;
            case "command-3":
                //业务逻辑
                break;
        }
        System.out.println("不支持此命令" + command);
    }
}
