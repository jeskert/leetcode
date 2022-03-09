package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.PerfectNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PopulatingNextRightPointersInEachNodeTest {
    PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();

    @Test
    public void test1() {
        PerfectNode root = null;
        assertNull(populatingNextRightPointersInEachNode.connect(root));
    }
}