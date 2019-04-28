package com.wyh.designpattern.agent.dynamicPoxy.jdk;

import com.wyh.designpattern.agent.staticPoxy.Girl;
import com.wyh.designpattern.agent.staticPoxy.TeacherCang;
import com.wyh.designpattern.agent.staticPoxy.TuHao;

public class PlayGame {

    public static void main(String[] args) {
        TuHao th = new TuHao(1.7F);
        Girl tc = new TeacherCang();
        //这里使用代理
        Girl tony1 = (Girl) TonyCompany.proxy(tc);
        th.dating(tony1);
    }
}
