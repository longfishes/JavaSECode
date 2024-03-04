package com.longfish.test2;

import com.longfish.test.Order;

public class SubOrder extends Order {               //类的继承

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderPublic);

    }

    public void method(){
        orderProtected = 0;
    }
}
