package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> existMap = new HashMap<>();
        existMap.put(n, Boolean.TRUE);
        while (n != 1) {
            n = squareSum(n);
            if (existMap.containsKey(n)) {
                return false;
            } else {
                existMap.put(n, Boolean.TRUE);
            }
        }
        return true;
    }

    private int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
