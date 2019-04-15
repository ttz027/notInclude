package com.zt.apple.service;

public class Test {
    public static void main(String[] args) {
        AppleService s = new AppleServiceImpl();
        s.add();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
