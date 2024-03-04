package com.longfish.encapsulation;

public class Book {
    private String name;
    private double price;
    private String author;

    public void fillPrice(Book book){
        book.price = (int)(Math.random()*50+1);
    }

    public double showPrice(Book book){
        return book.price;
    }
}
