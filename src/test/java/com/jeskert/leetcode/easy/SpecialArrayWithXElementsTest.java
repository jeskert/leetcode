package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialArrayWithXElementsTest {
    SpecialArrayWithXElements specialArrayWithXElements = new SpecialArrayWithXElements();

    @Test
    public void test1() {
        assertEquals(2, specialArrayWithXElements.specialArray(new int[]{3, 5}));
        assertEquals(-1, specialArrayWithXElements.specialArray(new int[]{0, 0}));
        assertEquals(3, specialArrayWithXElements.specialArray(new int[]{0, 4, 3, 0, 4}));
        assertEquals(-1, specialArrayWithXElements.specialArray(new int[]{3, 6, 7, 7, 0}));
    }
}