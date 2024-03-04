package com.longfish.oopbase;

public class Phone {
    String name;    //成员变量（属性）有默认值
    int price;      //成员变量（属性）作用域是整个类，包含了方法

    /*  有四种权限修饰符（封装性），属性可以加权限修饰符（public int price）
     * private
     * 缺省
     * protected
     * public
     */

    public void call(int num){
        System.out.println("拨打电话："+num);        //方法，方法内的变量是局部变量，作用域是这个方法
    }
    public void game(String gameType){
        System.out.println("正在游玩游戏"+gameType);
    }
    public void message(String edit,int num){
        System.out.println("发送"+edit+"给联系人"+num);
    }
}
