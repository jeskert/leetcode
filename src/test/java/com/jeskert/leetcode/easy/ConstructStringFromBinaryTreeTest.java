package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructStringFromBinaryTreeTest {
    ConstructStringFromBinaryTree constructStringFromBinaryTree = new ConstructStringFromBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertEquals("1(2(4))(3)", constructStringFromBinaryTree.tree2str(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertEquals("1(2()(4))(3)", constructStringFromBinaryTree.tree2str(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), null);
        assertEquals("3(1()(2))", constructStringFromBinaryTree.tree2str(root));
    }
}