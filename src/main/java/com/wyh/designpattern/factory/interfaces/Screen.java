package com.wyh.designpattern.factory.interfaces;

public interface Screen {
    void size();

    class Screen5 implements Screen {
        @Override
        public void size() {
            System.out.println("5");
        }
    }

    class Screen7 implements Screen {
        @Override
        public void size() {
            System.out.println("7");
        }
    }
}
