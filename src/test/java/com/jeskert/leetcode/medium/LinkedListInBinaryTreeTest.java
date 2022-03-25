package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;
import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListInBinaryTreeTest {
    LinkedListInBinaryTree linkedListInBinaryTree = new LinkedListInBinaryTree();

    @Test
    public void test1() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(8)));
        TreeNode root = new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1), null)),
                new TreeNode(4, new TreeNode(2, new TreeNode(6), new TreeNode(8, new TreeNode(1), new TreeNode(3))), null));
        assertTrue(linkedListInBinaryTree.isSubPath(head, root));
    }
}