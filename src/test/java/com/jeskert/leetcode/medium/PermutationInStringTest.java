package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationInStringTest {
    PermutationInString permutation = new PermutationInString();

    @Test
    public void test() {
        assertTrue(permutation.checkInclusion("ab", "eidbaooo"));
        assertFalse(permutation.checkInclusion("ab", "eibdoaoo"));
    }
}