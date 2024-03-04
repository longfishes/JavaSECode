package com.longfish._static;

public class Chinese {
    //非静态变量，实例变量
    String name;
    int age;

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态变量，类变量
    static String nation = "China";

    public static void method(){
        System.out.println("111");
    }

    public static int method2(){
        return 222;
    }
}
