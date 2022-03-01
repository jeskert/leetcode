package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptStringTest {
    DecryptString decryptString = new DecryptString();

    @Test
    public void test1() {
        assertEquals("jkab", decryptString.freqAlphabets("10#11#12"));
        assertEquals("acz", decryptString.freqAlphabets("1326#"));
        assertEquals("y", decryptString.freqAlphabets("25#"));
        assertEquals("abcdefghijklmnopqrstuvwxyz", decryptString.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}