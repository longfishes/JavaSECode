package com.longfish.project.project4;

public class Book {
    private String name;
    private String press;
    private int price;
    private int year;

    public Book(String name, String press, int price, int year) {
        this.name = name;
        this.press = press;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDetail(){
        return name+"\t"+press+"\t"+price+"\t"+year;
    }
}
