package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialArrayWithSpecialElementTest {
    SpecialArrayWithSpecialElement specialArrayWithSpecialElement = new SpecialArrayWithSpecialElement();

    @Test
    public void test1() {
        assertEquals(2, specialArrayWithSpecialElement.specialArray(new int[]{3, 5}));
    }

    @Test
    public void test2() {
        assertEquals(-1, specialArrayWithSpecialElement.specialArray(new int[]{0, 0}));
    }

    @Test
    public void test3() {
        assertEquals(3, specialArrayWithSpecialElement.specialArray(new int[]{0, 4, 3, 0, 4}));
    }

    @Test
    public void test4() {
        assertEquals(-1, specialArrayWithSpecialElement.specialArray(new int[]{3, 6, 7, 7, 0}));
    }
}
