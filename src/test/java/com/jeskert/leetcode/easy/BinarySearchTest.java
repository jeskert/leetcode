package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test1() {
        assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}