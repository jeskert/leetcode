package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode actual = removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 2);
        assertEquals(res, actual);
    }

    @Test
    public void test2() {
        ListNode listNode = new ListNode(1);
        ListNode res = new ListNode();
        assertEquals(res, removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
    }

    @Test
    public void test3() {
        ListNode listNode = new ListNode(1, new ListNode(2));
        ListNode res = new ListNode(1);
        assertEquals(res, removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
    }
}