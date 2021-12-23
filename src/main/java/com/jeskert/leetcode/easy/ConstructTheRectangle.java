package com.jeskert.leetcode.easy;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int W = 0;
        double floor = Math.floor(Math.sqrt(area));
        for (int i = (int) floor; i > 0; i--) {
            if (area % i == 0) {
                W = i;
                break;
            }
        }
        res[0] = area / W;
        res[1] = W;
        return res;
    }
}
