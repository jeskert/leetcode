package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintNumbersTest {
    PrintNumbers printNumbers = new PrintNumbers();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, printNumbers.printNumbers(1));
    }
}