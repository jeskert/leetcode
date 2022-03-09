package com.jeskert.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortIntegersByOneBits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(Comparator.comparing(Integer::bitCount).thenComparingInt(a -> a))
                .collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
    }
}
