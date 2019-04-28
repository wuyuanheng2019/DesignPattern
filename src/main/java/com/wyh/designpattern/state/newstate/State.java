package com.wyh.designpattern.state.newstate;

public interface State {
    //抽象出来各种行为
    void pay();

    void refund();

    void buy();

    void getCoffee();
}
