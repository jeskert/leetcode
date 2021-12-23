package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeemoAttackingTest {
    TeemoAttacking teemoAttacking = new TeemoAttacking();

    @Test
    public void test1() {
        assertEquals(4, teemoAttacking.findPoisonedDuration(new int[]{1, 4}, 2));
        assertEquals(3, teemoAttacking.findPoisonedDuration(new int[]{1, 2}, 2));
    }
}