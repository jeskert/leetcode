package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    public int dfs(TreeNode node) {
        int ans = 0;
        if (node.left != null) {
            ans += isLeaf(node.left) ? node.left.val : dfs(node.left);
        }
        if (node.right != null && !isLeaf(node.right)) {
            ans += dfs(node.right);
        }
        return ans;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
