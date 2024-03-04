package com.longfish.encapsulation;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "坤坤";
        a1.setLegs(a1,2);

        System.out.println(a1.getLegs());
    }
}
