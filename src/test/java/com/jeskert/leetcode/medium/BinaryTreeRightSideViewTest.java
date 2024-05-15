package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeRightSideViewTest {

    BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        assertEquals("[1, 3, 4]", binaryTreeRightSideView.rightSideView(root).toString());
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        assertEquals("[1, 3]", binaryTreeRightSideView.rightSideView(root).toString());
    }
}