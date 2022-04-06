package com.jeskert.leetcode.medium;

import java.util.PriorityQueue;

public class SeatManager {
    PriorityQueue<Integer> available;
    public SeatManager(int n) {
        available = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            available.offer(i);
        }
    }

    public int reserve() {
        return available.poll();
    }

    public void unreserve(int seatNumber) {
        available.offer(seatNumber);
    }
}
