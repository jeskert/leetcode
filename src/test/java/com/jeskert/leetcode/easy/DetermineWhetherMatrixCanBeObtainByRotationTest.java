package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineWhetherMatrixCanBeObtainByRotationTest {
    DetermineWhetherMatrixCanBeObtainByRotation determineWhetherMatrixCanBeObtainByRotation = new DetermineWhetherMatrixCanBeObtainByRotation();

    @Test
    public void test1() {
//        assertTrue(determineWhetherMatrixCanBeObtainByRotation.findRotation(new int[][]{{0, 1}, {1, 0}}, new int[][]{{1, 0}, {0, 1}}));
//        assertFalse(determineWhetherMatrixCanBeObtainByRotation.findRotation(new int[][]{{0, 1}, {1, 1}}, new int[][]{{1, 0}, {0, 1}}));
//        assertTrue(determineWhetherMatrixCanBeObtainByRotation.findRotation(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}}));
        assertTrue(determineWhetherMatrixCanBeObtainByRotation.findRotation(new int[][]{{1, 1}, {0, 1}}, new int[][]{{1, 1}, {1, 0}}));
    }
}