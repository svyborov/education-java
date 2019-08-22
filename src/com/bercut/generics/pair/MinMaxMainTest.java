package com.bercut.generics.pair;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxMainTest {

    @Test
    public void test_minMax() {
        OrderedPair<Integer, Integer> minMax = (OrderedPair<Integer, Integer>) MinMaxMain.minMax(1, 2, 3);
        assertEquals(1, (int) minMax.getFirstItem());
        assertEquals(3, (int) minMax.getSecondItem());
    }


    @Test
    public void test_minMax_negative() {
        OrderedPair<Integer, Integer> minMax = (OrderedPair<Integer, Integer>) MinMaxMain.minMax(1, -2, 3);
        assertEquals(-2, (int) minMax.getFirstItem());
        assertEquals(3, (int) minMax.getSecondItem());
    }
}
