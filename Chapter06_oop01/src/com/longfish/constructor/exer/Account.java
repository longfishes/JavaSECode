package com.longfish.constructor.exer;

public class Account {
    int id;
    long balance;
    double annualInterestRate;

    public Account(int i,long b,double a){
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public void setter(int i,long b,double a){
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public String getter(Account a){
        return "id:"+a.id + "\tbalance:" +a.balance+ "\tannualInterestRate:" +a.annualInterestRate*100 + "%";
    }

    public void withdraw(Account a,long money){
        if (money <= a.balance){
            a.balance -= money;
        }else{
            System.out.println("你钱不够");
        }
    }

    public void deposit(Account a,long money){
        a.balance += money;
    }
}
