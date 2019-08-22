package com.bercut.main.bank;

public class UserWallet {
    String walletId;
    int rubles;

    public UserWallet(String walletId, int rubles) {
        this.walletId = walletId;
        this.rubles = rubles;
    }

    void plusMoney(int amount) {
        rubles += amount;
    }
    boolean minusMoney(int amount) {
        if (rubles < amount) {
            System.out.println("Недостаточно средств на кошельке ID для снятия " + amount + " рублей");
            return false;
        }
        rubles -= amount;
        return true;
    }

    void printWalletState() {
        System.out.println("Идетификатор кошелька: " + walletId + "." + "Сумма: " + rubles + ".");
    }
}
