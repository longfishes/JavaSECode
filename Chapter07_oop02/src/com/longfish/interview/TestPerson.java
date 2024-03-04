package com.longfish.interview;

public class TestPerson {
    public static void main(String[] args) {

        //一般场景
        Person p1 = new Person();
        Man m1 = new Man();
        Women w1 = new Women();

        //多态性适用于方法，不适用于属性          //向上转型（自动类型提升）
        Person person01 = new Man();
        Person person02 = new Women();
        m1.isSmoking = true;

        person01.method();
        System.out.println(person01.getAge());
        System.out.println(person01.age);

        if (person01 instanceof Man){       //向下转型（强制类型转换）
            Man man = (Man) person01;
            man.isSmoking = true;
            System.out.println(man.isSmoking);
        }

        System.out.println(p1 instanceof Man);              //使用instanceof避免类型转换异常
        System.out.println(person02 instanceof Man);
        System.out.println(w1 instanceof Women);

        System.out.println(m1.equals(w1));          //自定义类没有重写的equals（）比较地址值

    }
}
