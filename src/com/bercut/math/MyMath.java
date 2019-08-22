package com.bercut.math;

public class MyMath {

    public static void main(String[] args) {
        double sqrt = 0;

        try {
            System.out.println("try start");
            sqrt = sqrt(-3.14);
            System.out.println("try end");

        } catch (Exception e) {
            System.err.println("Упс. Попробуйте еще раз.");
        }
        System.out.println(sqrt);
    }

    static double sqrt(double a) throws Exception {
        if (a < 0) {
            throw new Exception("argument less than zero");
        }
        return Math.sqrt(a);
    }
}
