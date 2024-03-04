package com.longfish.tostringoverride;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("longfish",18,'男',"114");
        System.out.println(p);      //=System.out.println(p.toString());

    }
}
