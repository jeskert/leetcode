package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;

import java.util.Stack;

public class AddTwoNumberII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = convertListNodeToStack(l1);
        Stack<Integer> s2 = convertListNodeToStack(l2);
        int carry = 0;
        ListNode ans = null;
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int a = s1.isEmpty() ? 0 : s1.pop();
            int b = s2.isEmpty() ? 0 : s2.pop();
            int cur = a + b + carry;
            carry = cur / 10;
            cur %= 10;
            ListNode curnode = new ListNode(cur);
            curnode.next = ans;
            ans = curnode;
        }
        return ans;
    }

    Stack<Integer> convertListNodeToStack(ListNode node) {
        Stack<Integer> s = new Stack<>();
        ListNode i = node;
        while (i != null) {
            s.push(i.val);
            i = i.next;
        }
        return s;
    }
}
