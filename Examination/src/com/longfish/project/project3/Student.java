package com.longfish.project.project3;

public class Student {
    private String name;
    private char gender;
    private int grade;
    private int score;
    private String id;

    public Student() {
    }

    public Student(String name, char gender, int grade, int score, String id) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail(){
        return name+"\t"+gender+"\t"+grade+"\t"+score+"\t"+id;
    }
}
