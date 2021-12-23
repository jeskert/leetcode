package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubTreeOfAnotherTreeTest {
    SubTreeOfAnotherTree subTreeOfAnotherTree = new SubTreeOfAnotherTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertTrue(subTreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertFalse(subTreeOfAnotherTree.isSubtree(root, subRoot));
    }
}