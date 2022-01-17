package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;
public class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void test1() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
