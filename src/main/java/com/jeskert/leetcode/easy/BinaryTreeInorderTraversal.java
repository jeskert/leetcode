package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    void traverse(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            traverse(root.left, result);
        }
        result.add(root.val);
        if (root.right != null) {
            traverse(root.right, result);
        }
    }

}
