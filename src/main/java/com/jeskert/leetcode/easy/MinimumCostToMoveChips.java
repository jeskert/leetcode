package com.jeskert.leetcode.easy;

public class MinimumCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int evenCnt = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCnt++;
            }
        }
        return Math.min(position.length - evenCnt, evenCnt);
    }
}
