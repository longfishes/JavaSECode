package com.longfish.project.project1;

public class Product {
    private String name;
    private double price;
    private boolean isStored;
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStored() {
        return isStored;
    }

    public void setStored(boolean stored) {
        isStored = stored;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Product(String name, double price, boolean isStored, double rate) {
        this.name = name;
        this.price = price;
        this.isStored = isStored;
        this.rate = rate;
    }

    public String getDetail(){
        if (isStored) return name+"\t"+price+"\t是\t"+rate;
        else return name+"\t"+price+"\t否\t"+rate;
    }
}
