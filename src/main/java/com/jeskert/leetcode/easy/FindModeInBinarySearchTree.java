package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;

import java.util.*;

public class FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        int maxTimes = 0;
        int currentTimes = 0;
        int prev = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) == prev) {
                currentTimes++;
                if (currentTimes > maxTimes) {
                    maxTimes = currentTimes;
                }
            }
        }
        return null;
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
