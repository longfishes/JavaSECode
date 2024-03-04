package com.longfish.oopbase;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle circle1 = new Circle();

        System.out.println("请输入半径");
        circle1.getR(s.nextInt());

        System.out.println("半径为"+circle1.r);
        System.out.println("面积为"+circle1.area());
        System.out.println("周长为"+circle1.circle());
    }
}
