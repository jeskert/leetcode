package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;
import com.jeskert.leetcode.pojo.TreeNode;

public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val == root.val) {
            if (check(head, root)) {
                return true;
            }
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    boolean check(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val == root.val) {
            return check(head.next, root.left) || check(head.next, root.right);
        }
        return false;
    }
}
