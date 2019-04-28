package com.wyh.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverSample {
    public static void main(String[] args) {
        /*
         * java中提供了可观察的主题和观察者，我们只需要实现具体的接口即可
         */
        Observable subject1 = new Observable() {
            public synchronized void notifyObservers(Object data) {
                setChanged();
                super.notifyObservers(data);
            }
        };

        //添加观察者1
        subject1.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者1收到通知被更新了..." + arg);
            }
        });

        //添加观察者2
        subject1.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者2收到通知被更新了..." + arg);
            }
        });

        subject1.notifyObservers("change1");
        subject1.notifyObservers("change2");
    }
}
