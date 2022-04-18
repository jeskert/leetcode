package com.jeskert.leetcode.easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while (start <= end) {
            int mid = (start + end) / 2;
            long pow = (long) mid * mid;
            if (pow < num) {
                start = mid + 1;
            } else if (pow > num) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
