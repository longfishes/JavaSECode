package com.longfish.bank;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money){
        if (this.balance>=money){
            balance -= money;
            System.out.println("Successful!");
        }else{
            System.out.println("你钱不够");
        }
    }
}
