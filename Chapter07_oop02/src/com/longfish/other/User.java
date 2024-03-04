package com.longfish.other;                       //this(形参列表)结构能调用构造器(不能调用自己)，必须声明在当前构造器的首行，并且最多声明一个

public class User {
    private String name;
    private int age;

    public User(){
        System.out.println("初始化需要很长的代码");
    }

    public User(String name){
        this();                             //使用this()调用空参构造器
        this.name = name;
    }

    public User(String name, int age){       //使用this(name:)调用具体的构造器
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
