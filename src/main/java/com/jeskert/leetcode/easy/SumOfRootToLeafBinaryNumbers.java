package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    int res;

    public int sumRootToLeaf(TreeNode root) {
        sumBinary(root, 0);
        return res;
    }

    private void sumBinary(TreeNode root, int cur) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res += cur * 2 + root.val;
            return;
        }
        sumBinary(root.left, cur * 2 + root.val);
        sumBinary(root.right, cur * 2 + root.val);
    }
}
