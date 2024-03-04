package com.longfish.test;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderDefault);
        System.out.println(order.orderProtected);
        System.out.println(order.orderPublic);

//        System.out.println(order.orderPrivate);
    }
}
