package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CombinationTest {
    Combination combination = new Combination();

    @Test
    public void test1() {
        List<List<Integer>> res = combination.combine(4, 2);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 4), Arrays.asList(3, 4), Arrays.asList(1, 4), Arrays.asList(2, 3), Arrays.asList(1, 2), Arrays.asList(1, 3));
        assertThat(res, is(expected));
    }
}
