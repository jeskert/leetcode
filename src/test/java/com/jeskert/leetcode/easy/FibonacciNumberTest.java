package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {
    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    @Test
    public void test1() {
        assertEquals(1, fibonacciNumber.fib(2));
        assertEquals(2, fibonacciNumber.fib(3));
        assertEquals(3, fibonacciNumber.fib(4));
        assertEquals(5, fibonacciNumber.fib(5));
        assertEquals(8, fibonacciNumber.fib(6));
    }
}
