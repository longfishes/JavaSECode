package com.longfish.oopbase;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "魔法Zc目录";
        p1.age = 13;
        p1.gender = '女';
        System.out.println(p1.showAge());
        p1.addAge(2);
        System.out.println(p1.showAge());
        p1.study();
    }
}
