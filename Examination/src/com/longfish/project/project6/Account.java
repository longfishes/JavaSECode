package com.longfish.project.project6;

public class Account {
    private String id;
    private String password;
    private boolean isPlus;
    private double balance;

    public Account(String id, String password, boolean isPlus, double balance) {
        this.id = id;
        this.password = password;
        this.isPlus = isPlus;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPlus() {
        return isPlus;
    }

    public void setPlus(boolean plus) {
        isPlus = plus;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDetail(){
        if (isPlus) return id+"\t"+password+"\t"+"是"+"\t"+balance;
        return id+"\t"+password+"\t"+"否"+"\t"+balance;
    }
}
