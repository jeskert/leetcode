package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertIntoBitsTest {
    InsertIntoBits insertIntoBits = new InsertIntoBits();

    @Test
    public void test() {
        assertEquals(1100, insertIntoBits.insertBits(1024, 19, 2, 6));
        assertEquals(31, insertIntoBits.insertBits(0, 31, 0, 4));
    }
}
