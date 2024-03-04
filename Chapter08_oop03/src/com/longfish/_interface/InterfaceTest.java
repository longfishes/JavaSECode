package com.longfish._interface;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED+" "+Flyable.unit);

        Plane p = new Plane();
        p.fly();


    }
}
