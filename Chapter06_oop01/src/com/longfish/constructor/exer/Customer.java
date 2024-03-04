package com.longfish.constructor.exer;

public class Customer {

    private final String firstname;
    private final String lastname;
    private Account account;

    public Customer(String f,String l){
        firstname = f;
        lastname = l;
    }

    public void show(){
        String string = "";
        string += firstname;
        string += " ";
        string += lastname;
        System.out.println(string);
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setAccount(Account a){
        account = a;
    }

    public void showAccount(Account a){
        System.out.println(account.getter(a));
    }

    public Account getAccount(){
        return account;
    }
}
