package com.longfish.constructor.exer;

public class Test {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jane","Smith");
        Account account1 = new Account(1000,2000,0.0123);
        customer1.show();
        System.out.println(customer1.getFirstname()+" "+customer1.getLastname());

        customer1.setAccount(account1);
        customer1.showAccount(account1);

        customer1.getAccount().deposit(account1,100);
        System.out.println(account1.getter(account1));

        customer1.getAccount().withdraw(account1,960);
        System.out.println(account1.getter(account1));

        customer1.getAccount().withdraw(account1,2000);
    }
}
