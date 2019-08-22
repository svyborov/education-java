package com.bercut.generics.pair;

public class MinMaxMain {
    public static void main(String[] args) {
        Pair<Integer, Integer> minMax1 = minMax(1, 2, 3);
        System.out.println("Мин: " + minMax1.getFirstItem());
        System.out.println("Макс: " + minMax1.getSecondItem());

        Pair<Integer, Integer> minMax2 = minMax(12, 512, 1251);
        System.out.println("Мин: " + minMax2.getFirstItem());
        System.out.println("Макс: " + minMax2.getSecondItem());

        Pair<Integer, Integer> minMax3 = minMax(273, 1, 2145);
        System.out.println("Мин: " + minMax3.getFirstItem());
        System.out.println("Макс: " + minMax3.getSecondItem());

    }

    public static Pair<Integer, Integer> minMax(int a, int b, int c) {
        OrderedPair<Integer, Integer> minMaxItems = new OrderedPair<> ();
        minMaxItems.putFirstItem(Math.min(Math.min(a, b), c));
        minMaxItems.putSecondItem(Math.max(Math.max(a, b), c));

        return minMaxItems;
    };
}
