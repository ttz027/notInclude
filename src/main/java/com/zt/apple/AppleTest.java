package com.zt.apple;

import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        AppleService appleService = new AppleService();
        List<Apple> red = appleService.getAppleByPredicate(a -> a.getColor().equals("red") || a.getWidth() >= 80);

        for (Apple apple:red){
            System.out.println(apple.toString());
        }

    }
}
