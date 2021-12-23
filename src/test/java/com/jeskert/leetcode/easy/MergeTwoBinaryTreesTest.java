package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoBinaryTreesTest {
    MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();

    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode merged = mergeTwoBinaryTrees.mergeTrees(root1, root2);
        assertEquals(3, merged.val);
    }
}