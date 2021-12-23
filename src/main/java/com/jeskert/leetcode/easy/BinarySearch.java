package com.jeskert.leetcode.easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
