package com.longfish.oopbase;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.name = "Huawei Mate 60 Pro";
        p1.price = 6999;
        System.out.println(p1.name);
        System.out.println(p1.price);

        p1.call(110);
        p1.game("pvz");
        p1.message("SOS",114514);

        Phone p2 = new Phone();
        p2.name = "iPhone 15 Pro Max";
        System.out.println(p2.name);
        p2.message("TD",10086);
    }
}
