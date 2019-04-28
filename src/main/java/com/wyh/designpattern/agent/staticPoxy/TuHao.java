package com.wyh.designpattern.agent.staticPoxy;

public class TuHao {
    /**
     * 身高
     */
    private float length;

    public TuHao(float length) {
        this.length = length;
    }

    /**
     * 相遇
     *
     * @param g 女孩
     */
    public void dating(Girl g) {
        g.dating(length);
    }
}
