package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumberIITest {
    AddTwoNumberII addTwoNumberII = new AddTwoNumberII();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(7))));
        assertEquals(res, addTwoNumberII.addTwoNumbers(l1, l2));
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = new ListNode(8, new ListNode(0, new ListNode(7)));
        assertEquals(res, addTwoNumberII.addTwoNumbers(l1, l2));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode res = new ListNode(1, new ListNode(0));
        assertEquals(res, addTwoNumberII.addTwoNumbers(l1, l2));
    }

    @Test
    public void test4() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode res = new ListNode(0);
        assertEquals(res, addTwoNumberII.addTwoNumbers(l1, l2));
    }

    @Test
    public void test5() {
        ListNode l1 = new ListNode(6, new ListNode(4, new ListNode(5, new ListNode(0, new ListNode(4, new ListNode(4))))));
        ListNode l2 = new ListNode(3, new ListNode(8, new ListNode(8, new ListNode(0, new ListNode(3, new ListNode(0))))));
        ListNode res = new ListNode(1, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(0, new ListNode(7, new ListNode(3)))))));
        assertEquals(res, addTwoNumberII.addTwoNumbers(l1, l2));
    }
}