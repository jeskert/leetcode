package com.jeskert.leetcode.easy;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] temp = new int[100];
        for (int num : nums) {
            ans += temp[num - 1]++;
        }
        return ans;
    }
}
