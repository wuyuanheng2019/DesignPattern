package com.wyh.designpattern.factory.interfaces;

public interface PhoneFactory {

    /*
     这里进行了抽象，手机的工厂，属性为手机所含有的属性
     */

    /**
     * 获取使用的cpu
     *
     * @return cpu
     */
    Cpu getCpu();

    /**
     * 获取使用的屏幕size
     *
     * @return size
     */
    Screen getScreen();
}
