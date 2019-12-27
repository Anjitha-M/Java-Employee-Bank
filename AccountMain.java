package bank.ui;

import bank.entity.Account;

public class AccountMain {
    public static void main(String[] args) {
        AccountMain accm = new AccountMain();
        Account[] a = new Account[2];
        a[0] = new Account(101, "Ram", 1000);
        a[1] = new Account(102, "Raj", 500);

        a[0].addBalance(400);
        a[1].addBalance(300);

        accm.print(a);

        a[0].transferAmount(a[1], 100);

        accm.print(a);

    }

    public void print(Account[] a) {
        for (Account acc : a) {
            System.out.println(acc);
        }
    }


}
