package com.longfish._interface.exer02;

public class TestEatable {
    public static void main(String[] args) {

        Eatable[] es = new Eatable[3];

        es[0] = new Chinese();
        es[1] = new America();
        es[2] = new Indian();

        for (Eatable e : es) {
            e.eat();
        }
    }
}
