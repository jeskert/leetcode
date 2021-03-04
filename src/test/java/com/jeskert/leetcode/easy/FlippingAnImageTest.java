package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FlippingAnImageTest {

    FlippingAnImage flippingAnImage = new FlippingAnImage();

    @Test
    public void test1() {
        int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        assertArrayEquals(result, flippingAnImage.flipAndInvertImage(image));
    }

    @Test
    public void test2() {
        int[][] image = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertArrayEquals(result, flippingAnImage.flipAndInvertImage(image));
    }
}
