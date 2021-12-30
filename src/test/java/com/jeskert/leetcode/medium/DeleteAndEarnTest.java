package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteAndEarnTest {
    DeleteAndEarn deleteAndEarn = new DeleteAndEarn();

    @Test
    public void test1() {
        assertEquals(6, deleteAndEarn.deleteAndEarn(new int[]{3, 4, 2}));
        assertEquals(9, deleteAndEarn.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}