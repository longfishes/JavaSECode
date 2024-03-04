package com.longfish.equalsandhashcodeoverride;

public class Woman extends Person{

    private char cup;

    public Woman(String name, int age) {
        super(name, age);
    }

    public char getCup() {
        return cup;
    }

    public void setCup(char cup) {
        this.cup = cup;
    }
}
