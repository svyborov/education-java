package com.bercut.homework2;

import java.util.Arrays;
import java.util.logging.Logger;

public class HomeWork {
    static Logger logger = Logger.getLogger(HomeWork.class.getName());

    public static void main(String[] args) {
        int[] ar = new int[] {1, 2, 3, 4, 5, 6};
        logger.config("Массив до свапа: " + Arrays.toString(ar));
        boolean swapResult = Swap.swap(0, 3, ar);
        logger.info("Результат свапа: " + String.valueOf(swapResult));
        logger.config("Массив после свапа: " + Arrays.toString(ar));

        swapResult = Swap.swap(30, 3, ar);
        logger.info("Результат свапа: " + String.valueOf(swapResult));
        logger.config("Массив после свапа: " + Arrays.toString(ar));

        logger.info("Минимальное число: " + String.valueOf(min(1,2,3)));
        logger.info("Минимальное число: " + String.valueOf(min(124,12,79)));

        getSum();

    }

    private static int min(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);
    }

    public static double getSum() {
        double a = 1234567890;
        double b = 0.0000001;
        double sum = a;
        double sumb = 0;
        System.out.println(b);

        for (int i = 0; i < 1_000_000_000; i++) {
            sumb += b;
        }
        System.out.println(sumb);
        System.out.println(sum);
        sum += sumb;
        return sum;
    }

}
