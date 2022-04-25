package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    public void test1() {
        assertEquals(4, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(3, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{1}, 0));
    }
}