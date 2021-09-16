package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class BinaryTreeTilt {
    int tilt = 0;

    public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }

    public int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = root.val;
        int left = traverse(root.left);
        int right = traverse(root.right);
        tilt += Math.abs(left - right);
        return left + right + res;
    }
}
