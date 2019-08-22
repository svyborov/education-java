package com.bercut.homework2;

class Swap {
    static boolean swap(int i, int j, int[] anArray) {
        int l = anArray.length;

        if (i > l - 1 || j > l - 1 || i < 0 || j < 0) {
            return false;
        }
        int iVal = anArray[i];
        int jVal = anArray[j];

        anArray[i] = jVal;
        anArray[j] = iVal;

        return true;
    }
}
