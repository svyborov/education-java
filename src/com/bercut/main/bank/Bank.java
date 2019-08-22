package com.bercut.main.bank;

public class Bank {
    boolean transferMoney(UserWallet sourceWallet, UserWallet destinationWallet, int amount) {
        boolean minusMoneyResult = sourceWallet.minusMoney(amount);
        if (minusMoneyResult) {
            destinationWallet.plusMoney(amount);
            return true;
        }
        return false;
    }
}
