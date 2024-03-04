package com.longfish.project.project5;

public class Student {
    private String name;
    private char gender;
    private int age;
    private String id;
    private boolean isGenerate;

    public Student(String name, char gender, int age, String id, boolean isGenerate) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.isGenerate = isGenerate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isGenerate() {
        return isGenerate;
    }

    public void setGenerate(boolean generate) {
        isGenerate = generate;
    }

    public String getDetail() {
        if (isGenerate) return name + "\t" + gender + "\t" + age + "\t" + id + "\t" + "是";
        else return name + "\t" + gender + "\t" + age + "\t" + id + "\t" + "否";
    }
}
