package com.longfish._static;

public class AccountTest {
    public static void main(String[] args) {

        Account acc = new Account();
        Account acc2 = new Account();

        System.out.println(acc.getId());
        System.out.println(acc2.getId());

        Account.reset();

        Account[] accounts = new Account[10];
        for (int i = 0; i < 3; i++) {
            accounts[i] = new Account();
            System.out.println(accounts[i].getId());
        }
    }

}
