package com.longfish.interview;

public class Man extends Person{
    boolean isSmoking;
    int age = 22;

    @Override
    public void method() {
        System.out.println("2222");
    }

    @Override
    public int getAge(){
        return age;
    }
}
