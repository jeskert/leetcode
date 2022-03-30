package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (cur != null) {
                    row.add(cur.val);
                }
                if (cur.children != null && cur.children.size() > 0) {
                    for (Node child : cur.children) {
                        queue.offer(child);
                    }
                }
            }
            res.add(row);
        }
        return res;
    }
}
