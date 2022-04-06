package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeatManagerTest {

    @Test
    public void test1() {
        SeatManager seatManager = new SeatManager(5);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
        assertEquals(5, seatManager.reserve());
        seatManager.unreserve(5);
    }
}