package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {
    MyQueue myQueue = new MyQueue();

    @Test
    public void test1() {
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.peek());
        assertFalse(myQueue.empty());
    }
}