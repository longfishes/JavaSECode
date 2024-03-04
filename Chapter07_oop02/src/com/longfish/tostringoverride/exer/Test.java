package com.longfish.tostringoverride.exer;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.color = '绿';
        c2.color = '绿';

        c1.radium = 2;
        c2.radium = 3;

        System.out.println(c1.equals(c2));
        System.out.println(c1.colorEquals(c2));

        System.out.println(c1);
    }
}
