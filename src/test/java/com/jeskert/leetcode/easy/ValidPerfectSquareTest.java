package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPerfectSquareTest {
    ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

    @Test
    public void test1() {
        assertTrue(validPerfectSquare.isPerfectSquare(16));
        assertFalse(validPerfectSquare.isPerfectSquare(14));
        assertTrue(validPerfectSquare.isPerfectSquare(1));
        assertTrue(validPerfectSquare.isPerfectSquare(4));
    }
}