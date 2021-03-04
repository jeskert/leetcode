package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class MinimumHeightTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return createMinimalTree(nums, 0, nums.length - 1);
    }

    private TreeNode createMinimalTree(int[] nums, int left, int right) {
        if (left < 0 || right > nums.length || left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = createMinimalTree(nums, left, mid - 1);
        n.right = createMinimalTree(nums, mid + 1, right);
        return n;
    }
}
