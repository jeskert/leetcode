package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {
    KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

    @Test
    public void test1() {
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }
}