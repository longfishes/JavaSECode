package com.longfish.other;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

        User u2 = new User("Tom");

        User u3 = new User("Smith",22);

        System.out.println(u3.getAge());
        System.out.println(u2.getName());
    }
}
