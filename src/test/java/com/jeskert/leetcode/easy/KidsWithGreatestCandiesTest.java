package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.easy.KidsWithGreatestCandies;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class KidsWithGreatestCandiesTest {

    KidsWithGreatestCandies kidsWithGreatestCandies = new KidsWithGreatestCandies();

    @Test
    public void test1() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> booleans = kidsWithGreatestCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(true, booleans.get(0));
        assertEquals(true, booleans.get(1));
        assertEquals(true, booleans.get(2));
        assertEquals(false, booleans.get(3));
        assertEquals(true, booleans.get(4));
    }

    @Test
    public void test2() {
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> booleans = kidsWithGreatestCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(true, booleans.get(0));
        assertEquals(false, booleans.get(1));
        assertEquals(false, booleans.get(2));
        assertEquals(false, booleans.get(3));
        assertEquals(false, booleans.get(4));
    }

    @Test
    public void test3() {
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;
        List<Boolean> booleans = kidsWithGreatestCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(true, booleans.get(0));
        assertEquals(false, booleans.get(1));
        assertEquals(true, booleans.get(2));
    }
}
