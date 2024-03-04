package com.longfish.oopbase;

public class Employee {
    int id;
    String name;
    int age;
    int salary;
    MyDate birthday;

    public void getInfo(int a,String b,int c,int d){
        id = a;
        name = b;
        age = c;
        salary = d;
    }

    public void getBirthday(int a,int b,int c){
        birthday.year = a;
        birthday.month = b;
        birthday.day = c;
    }

    public void showInfo(){
        System.out.println("id:" + id + "\tname:" + name +
                "\tage:" + age + "\tsalary:" + salary);
    }

    public void showBirthday(){
        System.out.println("生日为[" + birthday.year + "年" +
                birthday.month + "月" + birthday.day + "日]");
    }
}
