package com.longfish.equalsandhashcodeoverride;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("你爹", 100);
        Person p2 = new Person("你爹", 100);

        System.out.println(p1.equals(p2));

        Person p3 = new Woman("aa", 17);
        Person p4 = new Woman("aa", 17);

        System.out.println(p3.equals(p4));

        Woman w1 = (Woman) p3;
        w1.setCup('A');
        System.out.println("aa是" + w1.getCup() + " cup");

        System.out.println(w1.equals(p4));
    }
}
