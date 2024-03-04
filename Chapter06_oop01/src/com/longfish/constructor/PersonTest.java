package com.longfish.constructor;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person(5);
        Person p2 = new Person();

        p1.print();
        p2.print();

        System.out.println(p1.print());
    }
}
