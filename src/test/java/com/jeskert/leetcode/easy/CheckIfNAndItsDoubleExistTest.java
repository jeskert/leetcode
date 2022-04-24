package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfNAndItsDoubleExistTest {
    CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();

    @Test
    public void test1() {
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(new int[]{10, 2, 5, 3}));
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(new int[]{7, 1, 14, 11}));
        assertFalse(checkIfNAndItsDoubleExist.checkIfExist(new int[]{3, 1, 7, 11}));
        assertFalse(checkIfNAndItsDoubleExist.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(new int[]{0, 0}));
    }
}