package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignOfTheProductOfAnArrayTest {
    SignOfTheProductOfAnArray signOfTheProductOfAnArray = new SignOfTheProductOfAnArray();

    @Test
    public void test1() {
        assertEquals(1, signOfTheProductOfAnArray.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(0, signOfTheProductOfAnArray.arraySign(new int[]{1, 5, 0, 2, -3}));
    }

    @Test
    public void test3() {
        assertEquals(-1, signOfTheProductOfAnArray.arraySign(new int[]{-1, 1, -1, 1, -1}));
    }

    @Test
    public void test4() {
        assertEquals(-1, signOfTheProductOfAnArray.arraySign(new int[]{41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41}));
    }

}
