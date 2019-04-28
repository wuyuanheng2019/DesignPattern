package com.wyh.designpattern.state.newstate;

public class SoldOutState implements State {

    private NewCoffeeMachine machine;

    public SoldOutState(NewCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pay() {
    }

    @Override
    public void refund() {
    }

    @Override
    public void buy() {
    }

    @Override
    public void getCoffee() {
    }
}
