package com.wyh.designpattern.responsibility;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityChain {

    /**
     * 责任链
     */
    private List<Responsibility> responsibilitys;

    /**
     * 责任链启始
     */
    private int index = 0;

    public ResponsibilityChain() {
        this.responsibilitys = new ArrayList<>();
    }

    /**
     * 链式处理
     *
     * @param request 请求
     */
    public void process(Request request) {
        if (this.index < this.responsibilitys.size()) {
            this.responsibilitys.get(index++).process(request,
                    this);
        }
    }

    /**
     * 把每个过滤器添加到责任链中
     *
     * @param res 过滤器
     */
    public void register(Responsibility res) {
        this.responsibilitys.add(res);
    }
}
