package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isResponding(root.left, root.right);
    }

    private boolean isResponding(TreeNode node1, TreeNode node2) {
        if (node1 == null) {
            return node2 == null;
        }
        if (node2 == null || node1.val != node2.val) {
            return false;
        }

        return isResponding(node1.left, node2.right) && isResponding(node1.right, node2.left);
    }
}
