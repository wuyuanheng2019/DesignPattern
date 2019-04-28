package com.wyh.designpattern.agent.staticPoxy;

public class Tony implements Girl {

    private Girl girl;

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public boolean dating(float length) {
        doSomethingBefore();
        boolean dating = girl.dating(length);
        doSomethingAfter();
        return dating;
    }

    private void doSomethingBefore() {
        //代理中的前置增强
        System.out.println("老板，这个我试过了，很不错，推荐给你！");
    }

    private void doSomethingAfter() {
        //代理中的后置增强
        System.out.println("老板，你觉得怎样，欢迎下次再约！");
    }
}
