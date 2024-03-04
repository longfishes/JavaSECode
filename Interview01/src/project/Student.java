package project;

public class Student {
    private String name;
    private char gender;
    private int grade;
    private double score;
    private String id;
    private boolean isGenerate;

    public Student() {
    }

    public Student(String name, char gender, int grade, double score, String id, boolean isGenerate) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.score = score;
        this.id = id;
        this.isGenerate = isGenerate;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isGenerate() {
        return isGenerate;
    }

    public void setGenerate(boolean generate) {
        isGenerate = generate;
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

    public double getScore() {
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
        if (isGenerate)return name+"\t"+gender+"\t"+grade+"\t"+score+"\t"+id+"\t是";
        return name+"\t"+gender+"\t"+grade+"\t"+score+"\t"+id+"\t否";
    }
}
