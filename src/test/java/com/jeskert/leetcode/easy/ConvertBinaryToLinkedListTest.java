package com.jeskert.leetcode.easy;

import com.jeskert.leetcode.pojo.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryToLinkedListTest {
    ConvertBinaryToLinkedList convertBinaryToLinkedList = new ConvertBinaryToLinkedList();


    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        assertEquals(5, convertBinaryToLinkedList.getDecimalValue(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(0);
        assertEquals(0, convertBinaryToLinkedList.getDecimalValue(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(0, new ListNode(0));
        assertEquals(0, convertBinaryToLinkedList.getDecimalValue(head));
    }
}