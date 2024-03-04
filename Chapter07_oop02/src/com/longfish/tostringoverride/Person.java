package com.longfish.tostringoverride;

public class Person {
    String name;
    int age;
    char gender;
    String id;

    public Person() {
    }

    public Person(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
