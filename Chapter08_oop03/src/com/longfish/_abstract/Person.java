package com.longfish._abstract;

public abstract class Person {      //abstract修饰的类不能够实例化，用于当作其他类的父类，如Java.lang.Object类
    String name;
    int age;

    public abstract void method();
}
