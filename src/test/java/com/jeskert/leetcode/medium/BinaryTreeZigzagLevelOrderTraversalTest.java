package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);
        assertEquals(3, result.size());
    }
}