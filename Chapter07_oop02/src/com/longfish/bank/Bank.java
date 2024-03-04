package com.longfish.bank;

public class Bank {
    private final Customer[] customers;
    private int numberOfCustomer;

    public Bank(int maxCustomer) {
        customers = new Customer[maxCustomer];
    }

    public void addCustomer(String firstname, String lastname) {
        Customer customer = new Customer(firstname, lastname);
        customers[numberOfCustomer] = customer;                          //或：customers[numberOfCustomer++] = customer;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            System.out.println("不存在该客户");
            return null;
        }
        return this.customers[index];
    }
}
