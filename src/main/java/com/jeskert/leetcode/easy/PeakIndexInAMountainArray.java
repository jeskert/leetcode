package com.jeskert.leetcode.easy;

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n - 2;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
