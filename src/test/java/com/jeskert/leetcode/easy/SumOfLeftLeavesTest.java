package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfLeftLeavesTest {
    SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        assertEquals(24, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }
}
