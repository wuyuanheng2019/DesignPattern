package com.wyh.designpattern.state.newstate;

public class NoPayState implements State {
    private NewCoffeeMachine machine;

    public NoPayState(NewCoffeeMachine machine) {
        this.machine = machine;
    }

    public void pay() {
        System.out.println("支付成功，请去确定购买咖啡。");
        this.machine.state = this.machine.PAY;
    }

    public void refund() {
        System.out.println("你尚未支付，请不要乱按！");
    }

    public void buy() {
        System.out.println("你尚未支付，请不要乱按！");
    }

    public void getCoffee() {
        System.out.println("你尚未支付，请不要乱按！");
    }
}