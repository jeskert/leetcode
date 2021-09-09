package com.jeskert.leetcode.easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num / 2;
        if (num == 0 || num == 1) {
            return true;
        }
        while (end - start > 1) {
            int mid = (start + end) / 2;
            int pow = mid * mid;
            if (pow < num) {
                start = mid;
            } else if (pow > num) {
                end = mid;
            } else {
                return true;
            }
        }
        return false;
    }
}
