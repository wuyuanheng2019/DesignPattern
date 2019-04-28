package com.wyh.designpattern.agent.staticPoxy;

public class PlayGame {
    public static void main(String[] args) {
        TuHao tuHao = new TuHao(1.8F);
        TeacherCang cang = new TeacherCang();
        Tony tony = new Tony();
        tony.setGirl(cang);
        tuHao.dating(tony);
    }
}
