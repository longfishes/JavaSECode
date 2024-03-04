package com.longfish.project.project3;

public class StudentList {
    private final Student[] students;
    private int total;

    public StudentList(int maxNumOfStudent) {
        students = new Student[maxNumOfStudent];
    }

    public Student getStudent(int index){
        if (index<0||index>total-1) return null;
        return students[index];
    }

    public Student[] getAllStudent(){
        Student[] stu = new Student[total];
        System.arraycopy(students, 0, stu, 0, total);
        return stu;
    }

    public int getTotal(){
        return total;
    }

    public int getMax(){
        return students.length;
    }

    public void addStudent(Student student){
        students[total++] = student;
    }

    public void replaceStudent(int index,Student student){
        students[index] = student;
    }

    public void deleteStudent(int index){
        if (total - 1 - index >= 0) System.arraycopy(students, index + 1, students, index, total - 1 - index);
        students[--total] = null;
    }
}
