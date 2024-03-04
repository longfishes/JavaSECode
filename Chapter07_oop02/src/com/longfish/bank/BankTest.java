package com.longfish.bank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(200);

        bank.addCustomer("long","fish");
        bank.addCustomer("EAw","selfish");

        bank.getCustomer(0).setAccount(new Account(10));
        bank.getCustomer(0).getAccount().withdraw(5);
        bank.getCustomer(0).getAccount().deposit(1000);
        System.out.println("你还有"+bank.getCustomer(0).getAccount().getBalance()+"块钱");

        System.out.println("咱们银行有"+bank.getNumberOfCustomer()+"个客户\n"+
                "第一个客户叫"+bank.getCustomer(0).getFirstname()+" "+
                bank.getCustomer(0).getLastname()+"\n" +
                "第二个客户叫"+bank.getCustomer(1).getFirstname()+" "+
                bank.getCustomer(1).getLastname());
    }
}
