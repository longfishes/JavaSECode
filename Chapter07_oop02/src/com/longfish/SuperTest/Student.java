package com.longfish.SuperTest;

public class Student extends Person{            //super：父类的    this：本类的，当前类下的
    int id;
    String name = "10086";

    public Student(){
        System.out.println("我是子类的构造器");
    }

    public Student(int a){
        super();
    }

    @Override
    public void method() {
        System.out.println("2222");
        super.method2();
        this.submethod();
    }

    public void submethod(){
        System.out.println("666");
    }

    public void superShow(){
        System.out.println(super.name);
    }

    public void show(){
        System.out.println(name);
    }
}
