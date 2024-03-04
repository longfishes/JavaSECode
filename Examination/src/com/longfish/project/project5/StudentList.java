package com.longfish.project.project5;

public class StudentList {
    private Student[] students;
    private int total;

    public StudentList(int maxNumOfStudent) {
        students = new Student[maxNumOfStudent];
    }

    public Student getStudent(int index) {
        if (index > students.length - 1) return null;
        else return students[index];
    }

    public Student[] getAllStudent(){
        Student[] stu = new Student[total];
        System.arraycopy(students, 0, stu, 0, total);
        return stu;
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

    public int getTotal(){
        return total;
    }

    public int getMax(){
        return students.length;
    }
}
