package com.zt.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleService {

    private List<Apple> appleStore = new ArrayList<>();
    public AppleService(){
        appleStore.add(new Apple("red",100,50,"陕西"));
        appleStore.add(new Apple("green",80,40,"新疆"));
        appleStore.add(new Apple("pink",110,60,"US"));
        appleStore.add(new Apple("black",120,80,"Story"));

    }
    public List<Apple> getAppleByPredicate(Predicate<Apple> predicate){
       /* List list = new ArrayList();
        for (Apple apple:appleStore){
            if(predicate.test(apple)){
                list.add(apple);
            }
        }
        return list;*/
    
        return appleStore.stream().filter(predicate).collect(Collectors.toList());
    }
}
