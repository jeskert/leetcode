package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTrailingZerosTest {
    FactorialTrailingZeros factorialTrailingZeros = new FactorialTrailingZeros();

    @Test
    public void test1() {
        assertEquals(0, factorialTrailingZeros.trailingZeros(3));
        assertEquals(1, factorialTrailingZeros.trailingZeros(5));
    }
}
