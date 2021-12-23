package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructTheRectangleTest {
    ConstructTheRectangle constructTheRectangle = new ConstructTheRectangle();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, constructTheRectangle.constructRectangle(4));
    }
}