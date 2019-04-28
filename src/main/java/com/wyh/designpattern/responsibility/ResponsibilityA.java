package com.wyh.designpattern.responsibility;

/**
 * 责任A
 */
public class ResponsibilityA implements Responsibility {

    @Override
    public void process(Request request, ResponsibilityChain chain) {
        //在这里存放处理逻辑
        System.out.println("Responsibility-A done something...");
        chain.process(request);
    }
}
