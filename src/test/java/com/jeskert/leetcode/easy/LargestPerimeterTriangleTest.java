package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPerimeterTriangleTest {
    LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();

    @Test
    public void test1() {
        assertEquals(5, largestPerimeterTriangle.largestPerimeter(new int[]{2, 1, 2}));
        assertEquals(0, largestPerimeterTriangle.largestPerimeter(new int[]{1, 2, 1}));
    }
}