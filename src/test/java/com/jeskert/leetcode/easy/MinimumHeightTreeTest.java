package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumHeightTreeTest {

    MinimumHeightTree minimumHeightTree = new MinimumHeightTree();

    @Test
    public void test1() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = minimumHeightTree.sortedArrayToBST(nums);
        assertEquals(0, treeNode.val);
    }
}
