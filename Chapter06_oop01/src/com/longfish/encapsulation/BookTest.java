package com.longfish.encapsulation;

public class BookTest {
    public static void main(String[] args) {
        Book[] book = new Book[10000];
        for (int i = 0; i < 10; i++) {
            book[i] = new Book();
        }

        book[0].fillPrice(book[0]);
        System.out.println(book[0].showPrice(book[0]));
    }
}
