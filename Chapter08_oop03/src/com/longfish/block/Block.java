package com.longfish.block;

public class Block {
    int id;
    String name;

    public Block() {
        System.out.println("我是构造器");
    }

    public static void method1(){
        System.out.println("我是一个静态方法");
    }

    {
        System.out.println("我是非静态代码块");
    }


    static {
        System.out.println("我是静态代码块");
    }
}
