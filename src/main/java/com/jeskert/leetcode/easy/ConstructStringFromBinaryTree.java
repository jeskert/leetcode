package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }
        StringBuilder res = new StringBuilder("");
        res.append(root.val);
        res.append("(");
        res.append(tree2str(root.left));
        res.append(")");
        if (root.right != null) {
            res.append("(");
            res.append(tree2str(root.right));
            res.append(")");
        }

        return res.toString();
    }

}
