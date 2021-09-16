package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {
    PathSum pathSum = new PathSum();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        assertTrue(pathSum.hasPathSum(root, 22));
    }

    @Test
    public void test2() {
        assertFalse(pathSum.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertFalse(pathSum.hasPathSum(root, 0));
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(-2, null, new TreeNode(-3));
        assertTrue(pathSum.hasPathSum(root, -5));
    }
}