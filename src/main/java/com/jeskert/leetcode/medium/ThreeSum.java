package com.jeskert.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> sub = twoSum(nums, i + 1, -nums[i]);
            for (List<Integer> ele : sub) {
                List<Integer> tuple = new ArrayList<>(ele);
                tuple.add(nums[i]);
                res.add(tuple);
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            int low = nums[left];
            int high = nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                res.add(Arrays.asList(nums[left], nums[right]));
                while (left < right && nums[left] == low) {
                    left++;
                }
                while (left < right && nums[right] == high) {
                    right--;
                }
            }
        }
        return res;
    }
}
