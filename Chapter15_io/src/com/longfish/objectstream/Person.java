package com.longfish.objectstream;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    //Serializable是一个标识接口，没有任何抽象方法，但是要有一个static final long serialVersionUID
    //如果不写会自动生成，但是随着类的更新，序列号也会更新。
    //如果已经声明，就不会变更
    private static final long serialVersionUID = 74853274889047L;

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
