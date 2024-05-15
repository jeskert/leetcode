package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    MaximalSquare maximalSquare = new MaximalSquare();

    @Test
    public void test1() {
        assertEquals(4, maximalSquare.maximalSquare(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
        assertEquals(1, maximalSquare.maximalSquare(new char[][]{{'0', '1'}, {'1', '0'}}));
    }
}