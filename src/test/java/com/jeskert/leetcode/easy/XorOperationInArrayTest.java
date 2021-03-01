package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XorOperationInArrayTest {

    XorOperationInArray xorOperationInArray = new XorOperationInArray();

    @Test
    public void test1() {
        int n = 5, start = 0;
        assertEquals(8, xorOperationInArray.xorOperation(n, start));
    }

    @Test
    public void test2() {
        int n = 4, start = 3;
        assertEquals(8, xorOperationInArray.xorOperation(n, start));
    }

    @Test
    public void test3() {
        int n = 1, start = 7;
        assertEquals(7, xorOperationInArray.xorOperation(n, start));
    }

    @Test
    public void test4() {
        int n = 10, start = 5;
        assertEquals(2, xorOperationInArray.xorOperation(n, start));
    }
}
