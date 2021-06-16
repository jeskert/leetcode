package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindAllNumbersDisappearedTest {
    FindAllNumbersDisappeared findAllNumbersDisappeared = new FindAllNumbersDisappeared();

    @Test
    public void test1() {
        List<Integer> disappearedNumbers = findAllNumbersDisappeared.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertTrue(disappearedNumbers.contains(5));
        assertTrue(disappearedNumbers.contains(6));
    }

    @Test
    public void test2() {
        List<Integer> disappearedNumbers = findAllNumbersDisappeared.findDisappearedNumbers(new int[]{1, 1});
        assertTrue(disappearedNumbers.contains(2));
    }
}
