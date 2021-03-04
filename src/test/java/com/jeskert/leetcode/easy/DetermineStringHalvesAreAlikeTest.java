package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetermineStringHalvesAreAlikeTest {

    DetermineStringHalvesAreAlike determineStringHalvesAreAlike = new DetermineStringHalvesAreAlike();

    @Test
    public void test1() {
        assertTrue(determineStringHalvesAreAlike.halvesAreAlike("book"));
    }

    @Test
    public void test2() {
        assertFalse(determineStringHalvesAreAlike.halvesAreAlike("textbook"));
    }

    @Test
    public void test3() {
        assertFalse(determineStringHalvesAreAlike.halvesAreAlike("MerryChristmas"));
    }

    @Test
    public void test4() {
        assertTrue(determineStringHalvesAreAlike.halvesAreAlike("AbCdEfGh"));
    }
}
