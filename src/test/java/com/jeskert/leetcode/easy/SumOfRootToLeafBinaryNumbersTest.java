package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfRootToLeafBinaryNumbersTest {
    SumOfRootToLeafBinaryNumbers sumOfRootToLeafBinaryNumbers = new SumOfRootToLeafBinaryNumbers();

    @Test
    public void test1() {
        TreeNode node1 = new TreeNode(0, new TreeNode(0), new TreeNode(1));
        TreeNode node2 = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode root = new TreeNode(1, node1, node2);
        assertEquals(22, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(0);
        assertEquals(0, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertEquals(3, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }
}
