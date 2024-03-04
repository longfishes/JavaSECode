package com.longfish.bank;

public class Customer {
    private final String firstname;
    private final String lastname;
    public Account account;

    public Customer(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
