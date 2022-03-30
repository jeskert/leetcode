package com.jeskert.leetcode.medium;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int pow = 1;
        int ans = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            pow *= nums[right];
            while (pow >= k) {
                pow /= nums[left++];
                ans += right - left + 1;
            }
        }
        return ans;
    }
}
