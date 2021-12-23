package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(treeNode));
    }
}