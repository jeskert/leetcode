package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.Node;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class NAryTreeLevelOrderTraversalTest {
    NAryTreeLevelOrderTraversal nAryTreeLevelOrderTraversal = new NAryTreeLevelOrderTraversal();

    @Test
    public void test1() {
        Node root = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4)));
        List<List<Integer>> res = nAryTreeLevelOrderTraversal.levelOrder(root);
        System.out.println(res);
    }
}