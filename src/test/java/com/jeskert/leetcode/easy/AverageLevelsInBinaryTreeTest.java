package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.TreeNode;
import lombok.val;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AverageLevelsInBinaryTreeTest {
    AverageLevelsInBinaryTree averageLevelsInBinaryTree = new AverageLevelsInBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<Double> doubles = averageLevelsInBinaryTree.averageOfLevels(root);
        assertEquals(3, doubles.get(0), 0.00001);
        assertEquals(14.5, doubles.get(1), 0.0000001);
        assertEquals(11, doubles.get(2), 0.000001);
    }
}