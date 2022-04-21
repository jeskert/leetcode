package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtsTest {
    Sqrts sqrts = new Sqrts();

    @Test
    public void test1() {
        assertEquals(2, sqrts.mySqrt(4));
        assertEquals(2, sqrts.mySqrt(8));
        assertEquals(3, sqrts.mySqrt(9));
        assertEquals(4, sqrts.mySqrt(16));
        assertEquals(10, sqrts.mySqrt(100));
        assertEquals(10, sqrts.mySqrt(120));
        assertEquals(46339, sqrts.mySqrt(2147395599));
        assertEquals(46340, sqrts.mySqrt(2147483647));
    }
}