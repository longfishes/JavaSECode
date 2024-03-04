package com.longfish._interface;

public class Plane implements Flyable,Test{
    @Override
    public void fly() {
        System.out.println("我会飞");
    }



}
