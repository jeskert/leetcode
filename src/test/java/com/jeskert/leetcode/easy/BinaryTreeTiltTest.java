package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTiltTest {
    BinaryTreeTilt binaryTreeTilt = new BinaryTreeTilt();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(1, binaryTreeTilt.findTilt(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, null, new TreeNode(7)));
        assertEquals(15, binaryTreeTilt.findTilt(root));
    }
}