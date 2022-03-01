package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NTreePreorderTraversalTest {
    NTreePreorderTraversal nTreePreorderTraversal = new NTreePreorderTraversal();

    @Test
    public void test1() {
        Node sub = new Node(3, Arrays.asList(new Node(5), new Node(6)));
        Node root = new Node(1, Arrays.asList(sub, new Node(2), new Node(4)));
        List<Integer> res = nTreePreorderTraversal.preorder(root);
        System.out.println(res);
    }
}