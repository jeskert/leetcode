package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    row.add(cur.val);
                }
                if (cur != null && cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur != null && cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(row);
        }
        return res;
    }
}
