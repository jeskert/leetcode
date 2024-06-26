package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
