package com.jeskert.leetcode.medium;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {

        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            long res = (long) left * left + (long) right * right;
            if (res > c) {
                right = right - 1;
            } else if (res < c) {
                left = left + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
