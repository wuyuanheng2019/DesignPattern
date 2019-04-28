package com.wyh.designpattern.responsibility;

public interface Responsibility {

    /**
     * 请求处理方法
     *
     * @param request 处理的对象
     * @param chain   责任链
     */
    void process(Request request, ResponsibilityChain chain);
}
