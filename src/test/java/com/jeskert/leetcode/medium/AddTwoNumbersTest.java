package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(res, addTwoNumbers.addTwoNumbers(l1, l2));
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode res = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertEquals(res, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}