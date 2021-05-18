package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortedDistanceToACharacterTest {
    ShortedDistanceToACharacter shortedDistanceToACharacter = new ShortedDistanceToACharacter();

    @Test
    public void test1() {
        int[] result = shortedDistanceToACharacter.shortestToChar("loveleetcode", 'e');
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, result);
    }

    @Test
    public void test2() {
        int[] result = shortedDistanceToACharacter.shortestToChar("aaab", 'b');
        assertArrayEquals(new int[]{3, 2, 1, 0}, result);
    }
}
