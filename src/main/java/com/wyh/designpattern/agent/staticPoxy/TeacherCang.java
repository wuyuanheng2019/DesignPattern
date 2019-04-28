package com.wyh.designpattern.agent.staticPoxy;

public class TeacherCang implements Girl {

    @Override
    public boolean dating(float length) {
        //填写业务逻辑
        if (length >= 1.7F) {
            System.out.println("身高可以，可以约！");
            return true;
        }
        System.out.println("身高不可以，不可约！");
        return false;
    }
}
