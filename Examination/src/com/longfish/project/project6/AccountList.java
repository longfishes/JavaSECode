package com.longfish.project.project6;

public class AccountList {
    private Account[] accounts;
    private int total;

    public AccountList(int maxNumOfAccount) {
        accounts = new Account[maxNumOfAccount];
    }

    public Account getAccount(int index) {
        if (index < 0 || index > total - 1) return null;
        else return accounts[index];
    }

    public Account[] getAllAccount(){
        Account[] newAccounts = new Account[total];
        System.arraycopy(accounts, 0, newAccounts, 0, total);
        return newAccounts;
    }

    public int getTotal() {
        return total;
    }

    public int getMax() {
        return accounts.length;
    }

    public void addAccount(Account account) {
        accounts[total++] = account;
    }

    public void replaceAccount(int index, Account product) {
        accounts[index] = product;
    }

    public void deleteAccount(int index) {
        if (total - 1 - index >= 0) System.arraycopy(accounts, index + 1, accounts, index, total - 1 - index);
        accounts[--total] = null;
    }
}
