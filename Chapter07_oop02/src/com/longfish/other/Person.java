package com.longfish.other;

public class Person {                       //Alt + Insert
    private String name;
    private char gender;
    private int age;

    public Person() {
    }

    public Person(int age, char gender) {     //构造器
        this.age = age;
        this.gender = gender;
    }

    public void setAge(int age) {           //有this修饰的变量为属性（类的成员变量）
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
