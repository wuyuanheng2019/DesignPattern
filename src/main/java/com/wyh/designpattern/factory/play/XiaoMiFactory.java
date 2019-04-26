package com.wyh.designpattern.factory.play;

import com.wyh.designpattern.factory.interfaces.Cpu;
import com.wyh.designpattern.factory.interfaces.PhoneFactory;
import com.wyh.designpattern.factory.interfaces.Screen;

public class XiaoMiFactory implements PhoneFactory {

    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu650();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen5();
    }
}
