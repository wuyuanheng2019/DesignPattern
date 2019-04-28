package com.wyh.designpattern.command;

public class CommandA implements Command {
    @Override
    public void execute() {
        //在这里执行对应的命令
        System.out.println("我是命令A");
    }
}
