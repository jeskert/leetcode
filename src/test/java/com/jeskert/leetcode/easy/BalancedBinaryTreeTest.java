package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {
    BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void test2() {
        TreeNode root = null;
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        assertFalse(balancedBinaryTree.isBalanced(root));
    }
}
