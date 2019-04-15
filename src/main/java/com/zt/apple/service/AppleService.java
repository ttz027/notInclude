package com.zt.apple.service;

public interface AppleService {
    default void show(){
        System.out.println("sssss");
    }
    public int add();
}
