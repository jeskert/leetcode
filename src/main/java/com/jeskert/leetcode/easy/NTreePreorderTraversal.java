package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.Node;

import java.util.ArrayList;
import java.util.List;

public class NTreePreorderTraversal {
    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        traverse(root);
        return res;
    }

    private void traverse(Node root) {
        if (root != null) {
            res.add(root.val);
            if (root.children != null) {
                for (Node child : root.children) {
                    traverse(child);
                }
            }
        }
    }
}
