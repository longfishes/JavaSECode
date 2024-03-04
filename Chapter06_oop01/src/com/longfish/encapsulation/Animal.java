package com.longfish.encapsulation;

/*
* private           本类内部
* 缺省               本包内
* protected         其他包子类
* public            其他包非子类     同模块内（Module）
* */

public class Animal {
    String name;
    private int legs;       //声明为private后只能在同一个类（class）调用

    public void setLegs(Animal animal,int l){
        if (l < 0){
            System.out.println("设置失败，腿的数量有误");
        }else if (l>200){
            System.out.println("设置失败，腿的数量有误");
        }else{
            animal.legs = l;
        }
    }

    public int getLegs(){
        return legs;
    }
}
