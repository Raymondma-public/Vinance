package com.ma.raymond.vinance.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestMyMath {
    @Test
    public void testRound0() {
        double result = MyMath.round(1500.12345678, 0);
        System.out.println(result);
        assertEquals(1500.0, result, 0);
    }

    @Test
    public void testRound1() {
        double result = MyMath.round(1500.12345678, 1);
        System.out.println(result);
        assertEquals(1500.1, result, 0);
    }

    @Test
    public void testRound2() {
        double result = MyMath.round(1500.12345678, 2);
        System.out.println(result);
        assertEquals(1500.12, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundNegative() {

        double result = MyMath.round(1500.12345678, -1);

    }
}

