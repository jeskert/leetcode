package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheMasseuseTest {
    TheMasseuse theMasseuse = new TheMasseuse();

    @Test
    public void test1() {
        assertEquals(4, theMasseuse.massage(new int[]{1, 2, 3, 1}));
        assertEquals(12, theMasseuse.massage(new int[]{2, 7, 9, 3, 1}));
        assertEquals(12, theMasseuse.massage(new int[]{2, 1, 4, 5, 3, 1, 1, 3}));
    }
}
