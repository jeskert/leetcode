package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test1() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        assertEquals(res, mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode res = new ListNode();
        assertEquals(res, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(0);
        ListNode res = new ListNode(0);
        assertEquals(res, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}