package com.jeskert.leetcode.easy;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) {
            return k;
        }
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) >> 1;
            int x = mid < arr.length ? arr[mid] : Integer.MAX_VALUE;
            if (x - mid - 1 >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return k - (arr[l - 1] - (l - 1) - 1) + arr[l - 1];
    }
}
