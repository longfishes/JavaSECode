package com.longfish.oopbase;

public class Student_util {

    public void sort(Student[] stu){
        for (int i = 0; i < stu.length - 1; i++) {
            for (int j = 0; j < stu.length - 1 - i; j++) {
                Student temp = stu[j];
                if (stu[j].score > stu[j + 1].score) {
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
    }

    public void show(Student[] stu){
        for (int i = 0; i < 20; i++) {
            System.out.println("学号：" + stu[i].num + "\t年级：" + stu[i].state + "\t分数：" + stu[i].score);
        }
    }

    public void show(Student[] stu,int grade){
        for (int i = 0; i < 20; i++) {
            if (stu[i].state == grade)
                System.out.println("学号：" + stu[i].num + "\t年级：" + stu[i].state + "\t分数：" + stu[i].score);
        }
    }

    public void fill(Student[] stu,int n){
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
            stu[i].num = i + 1;
            stu[i].state = (int) (Math.random() * 4 + 1);
            stu[i].score = (int) (Math.random() * 101);
        }
    }
}
