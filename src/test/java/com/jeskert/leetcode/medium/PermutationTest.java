package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PermutationTest {
    Permutation permutation = new Permutation();

    @Test
    public void test1() {
        List<List<Integer>> res = permutation.permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        assertThat(res, is(expected));
    }
}