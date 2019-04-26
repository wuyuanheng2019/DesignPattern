package com.wyh.designpattern.decorating.play;

import com.wyh.designpattern.decorating.Component;
import com.wyh.designpattern.decorating.ConcreteComponent;
import com.wyh.designpattern.decorating.DecoratorA;

public class DecoratorSample {
    public static void main(String[] args) {
        /*
           创建被装设者，装设者中含有被装设者对象
         */
        Component component = new ConcreteComponent();
        DecoratorA decoratorA = new DecoratorA(component);
        decoratorA.methodA();
        decoratorA.methodB();
    }
}
