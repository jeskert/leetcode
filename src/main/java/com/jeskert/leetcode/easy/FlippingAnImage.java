package com.jeskert.leetcode.easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int length = image[i].length;
            int[] res1 = new int[length];
            for (int i1 = 0; i1 < length; i1++) {
                res1[length - i1 - 1] = image[i][i1] == 0 ? 1 : 0;
            }
            res[i] = res1;
        }
        return res;
    }
}
