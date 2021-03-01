package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShuffleTheArrayTest {

    ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

    @Test
    public void test1() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = new int[]{2, 3, 5, 4, 1, 7};
        assertArrayEquals(result, shuffleTheArray.shuffle(nums, n));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] result = new int[]{1, 4, 2, 3, 3, 2, 4, 1};
        assertArrayEquals(result, shuffleTheArray.shuffle(nums, n));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 1, 2, 2};
        int n = 2;
        int[] result = new int[]{1, 2, 1, 2};
        assertArrayEquals(result, shuffleTheArray.shuffle(nums, n));
    }
}
