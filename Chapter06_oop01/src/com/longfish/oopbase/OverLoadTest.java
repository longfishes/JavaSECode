package com.longfish.oopbase;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadExer01 o = new OverLoadExer01();

        o.m0L(2);
        o.m0L(2, 3);
        o.m0L("hello");

        System.out.println();

        OverLoadExer02 o2 = new OverLoadExer02();
        System.out.println(o2.max(2, 3));
        System.out.println(o2.max(2.0, 3.0));
        System.out.println(o2.max(1.0, 2.0, 3.0));
        System.out.println(o2.max(4, 5, 3, 1, 7, 0, 9, 4));

    }
}
