package com.jeskert.leetcode.easy;

public class CountGoodRectangles {
    public int countGoodRectangles(int[][] rectangles) {
        int[] minSide = new int[rectangles.length];
        int max = minSide[0];
        int res = 0;
        for (int i = 0; i < rectangles.length; i++) {
            minSide[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }

        for (int i = 0; i < minSide.length; i++) {
            if (minSide[i] > max) {
                max = minSide[i];
            }
        }

        for (int i = 0; i < minSide.length; i++) {
            if (minSide[i] == max) {
                res++;
            }
        }
        return res;
    }
}
