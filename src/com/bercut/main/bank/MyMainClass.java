package com.bercut.main.bank;

public class MyMainClass {
    public static void main(String[] args) {
        UserWallet userWallet1 = new UserWallet("A1", 10);
        UserWallet userWallet2 = new UserWallet("A2", 50);

        Bank bank = new Bank();

        userWallet1.printWalletState();
        userWallet2.printWalletState();

        bank.transferMoney(userWallet1, userWallet2, 1);
        userWallet1.printWalletState();
        userWallet2.printWalletState();

        bank.transferMoney(userWallet2, userWallet1, 11);
        userWallet1.printWalletState();
        userWallet2.printWalletState();

        bank.transferMoney(userWallet1, userWallet2, 30);
        userWallet1.printWalletState();
        userWallet2.printWalletState();
    }
}
