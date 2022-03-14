package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals(new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))), reverseLinkedList.reverseList(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertEquals(new ListNode(2, new ListNode(1)), reverseLinkedList.reverseList(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode();
        assertEquals(head, reverseLinkedList.reverseList(head));
    }
}