package com.jeskert.leetcode.easy;

public class FactorialTrailingZeros {
    public int trailingZeros(int n) {
        int zeroCount = 0;
        long currentMultiple = 5;
        while (n >= currentMultiple) {
            zeroCount += (n / currentMultiple);
            currentMultiple *= 5;
        }
        return zeroCount;
    }
}
