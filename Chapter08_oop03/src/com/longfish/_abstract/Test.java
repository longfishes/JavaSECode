package com.longfish._abstract;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Man();
        Man m1 = new Man();
        Person person = new Person() {

            public void method() {
                System.out.println("我是又重写了一次的抽象方法");
            }
        };

        m1.method();
        person.method();
        p1.method();

    }
}
