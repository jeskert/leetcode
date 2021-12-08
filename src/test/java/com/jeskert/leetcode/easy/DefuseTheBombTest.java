package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefuseTheBombTest {
    DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{12, 10, 16, 13}, defuseTheBomb.decrypt(new int[]{5, 7, 1, 4}, 3));
        assertArrayEquals(new int[]{0, 0, 0, 0}, defuseTheBomb.decrypt(new int[]{1, 2, 3, 4}, 0));
        assertArrayEquals(new int[]{12, 5, 6, 13}, defuseTheBomb.decrypt(new int[]{2, 4, 9, 3}, -2));
    }
}