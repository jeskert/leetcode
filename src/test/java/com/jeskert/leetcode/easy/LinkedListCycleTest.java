package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {
    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void test1() {
        ListNode node1 = new ListNode(2);
        ListNode node3 = new ListNode(-4, node1);
        ListNode node2 = new ListNode(0, node3);
        ListNode head = new ListNode(3, node1);
        node1.next = node2;
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(2);
        ListNode head = new ListNode(1, node1);
        node1.next = head;
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        assertFalse(linkedListCycle.hasCycle(head));
    }
}