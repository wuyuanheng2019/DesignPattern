package com.wyh.designpattern.responsibility;

/**
 * 责任B
 */
public class ResponsibilityB implements Responsibility {

    @Override
    public void process(Request request, ResponsibilityChain chain) {
        //在这里存放处理逻辑
        System.out.println("Responsibility-B done something...");
        chain.process(request);
    }
}