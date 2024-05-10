package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorOfABinaryTreeTest {

    LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        assertEquals(3, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);
        assertEquals(5, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertEquals(1, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q).val);
    }
}