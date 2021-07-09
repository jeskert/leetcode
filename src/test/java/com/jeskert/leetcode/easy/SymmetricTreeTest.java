package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {
    SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null));
        root.right = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null));
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(3));
        assertFalse(symmetricTree.isSymmetric(root));
    }
}
