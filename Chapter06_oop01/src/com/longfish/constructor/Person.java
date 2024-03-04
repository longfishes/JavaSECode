package com.longfish.constructor;

public class Person {               //每一个类都有构造器，没有声明也有默认的空参构造器

    private int age;

    public int print(){
        System.out.println("print方法1111");
        return age;
    }
    public Person(int a){                    //构造器
        System.out.println("2222");
        age = a;
    }

    public Person(){                    //空参构造器
        System.out.println("3333");
    }
}
