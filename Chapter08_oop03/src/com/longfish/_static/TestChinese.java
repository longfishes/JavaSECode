package com.longfish._static;

public class TestChinese {
    public static void main(String[] args) {
        Chinese c1 = new Chinese("long",1);
        Chinese c2 = new Chinese("fish",2);

        System.out.println(Chinese.nation);
        c1.nation = "America";
        System.out.println(c1.nation);
        System.out.println(c2.nation);
        System.out.println(Chinese.nation);     //static属性，所有实例共享一个属性

        Chinese.method();
        System.out.println(Chinese.method2());

    }
}
