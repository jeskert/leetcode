package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindModeInBinarySearchTreeTest {
    FindModeInBinarySearchTree findModeInBinarySearchTree = new FindModeInBinarySearchTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        assertArrayEquals(new int[]{2}, findModeInBinarySearchTree.findMode(root));
    }
}