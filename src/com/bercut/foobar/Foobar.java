package com.bercut.foobar;

import java.util.Arrays;

public class Foobar {
    public static void main(String[] args) {
        String[] arr = new String[] {"1", "2", "4", "3", "5", "4", "7", "8", "9", "10", "12", "15", "25", "30"};
        fooBar(arr);
    }


    private static void fooBar(String[] array) {
        String[] newArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            int val = Integer.parseInt(array[i]);
            System.out.println(val);
            boolean digest3 = val % 3 == 0;
            boolean digest5 = val % 5 == 0;
            if (digest3) {
                if (digest5) {
                    newArr[i] = "foobar";
                } else {
                    newArr[i] = "foo";
                }
            } else if (digest5) {
                newArr[i] = "bar";
            } else {
                newArr[i] = array[i];
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
