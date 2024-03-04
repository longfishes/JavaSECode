package com.longfish.project.project2;

public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int maxNumOfCustomer) {
        customers = new Customer[maxNumOfCustomer];
    }

    public void addCustomer(Customer customer) {
        customers[total++] = customer;
    }

    public void replaceCustomer(int index, Customer customer) {
        customers[index] = customer;
    }

    public void deleteCustomer(int index) {
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index > total - 1) return null;
        return customers[index];
    }

    public Customer[] getAllCustomer() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public int getTotal() {
        return total;
    }

    public int getMax() {
        return customers.length;
    }
}
