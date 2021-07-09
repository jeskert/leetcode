package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePreorderTraversalTest {
    BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(3), null);
        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(root);
        assertArrayEquals(new Integer[]{1,2,3}, result.toArray());
    }
}
