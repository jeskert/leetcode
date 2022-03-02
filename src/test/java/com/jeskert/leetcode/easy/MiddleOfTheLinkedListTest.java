package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListTest {
    MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    public void test1() {
        ListNode ans = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode head = new ListNode(1, new ListNode(2, ans));
        assertSame(ans, middleOfTheLinkedList.middleNode(head));
    }

    @Test
    public void test2() {
        ListNode ans = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, ans)));
        assertSame(ans, middleOfTheLinkedList.middleNode(head));
    }
}