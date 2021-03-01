package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CreateTargetArrayInGivenOrderTest {

    CreateTargetArrayInGivenOrder createTargetArrayInGivenOrder = new CreateTargetArrayInGivenOrder();

    @Test
    public void test1() {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, createTargetArrayInGivenOrder.createTargetArray(nums, index));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 0};
        int[] index = new int[]{0, 1, 2, 3, 0};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, createTargetArrayInGivenOrder.createTargetArray(nums, index));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1};
        int[] index = new int[]{0};
        assertArrayEquals(new int[]{1}, createTargetArrayInGivenOrder.createTargetArray(nums, index));
    }

}
