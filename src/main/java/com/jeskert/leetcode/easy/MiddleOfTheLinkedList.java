package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next;
            }
        }
        return slow;
    }
}
