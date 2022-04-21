package com.jeskert.leetcode.easy;

public class Sqrts {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            long pow = (long) mid * mid;
            if (pow == x) {
                return mid;
            } else if (pow < x) {
                if ((long) (mid + 1) * (mid + 1) > x) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
