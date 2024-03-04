package com.longfish.comparable;

public class Product implements Comparable{
    private String name;
    private double price;


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

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        if (o instanceof Product){
            Product p = (Product) o;

            return Double.compare(this.price,p.getPrice());
        }
        throw new RuntimeException("类型不匹配");


    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
