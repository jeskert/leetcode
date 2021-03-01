package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {
    JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    public void test1() {
        String j = "aA";
        String s = "aAAbbbb";
        assertEquals(3, jewelsAndStones.numJewelsInStones(j, s));
    }

    @Test
    public void test2() {
        String j = "z";
        String s = "ZZ";
        assertEquals(0, jewelsAndStones.numJewelsInStones(j, s));
    }
}
