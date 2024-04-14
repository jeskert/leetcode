package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
