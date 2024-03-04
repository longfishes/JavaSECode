package com.longfish.oopbase;

public class StudentTest {
    public static void main(String[] args) {

        Student[] stu = new Student[20];

        Student_util student_util = new Student_util();

        student_util.fill(stu,20);

        student_util.show(stu,3);

        System.out.println();

        student_util.sort(stu);

        student_util.show(stu);
    }
}
