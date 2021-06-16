package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberComplementTest {
    NumberComplement numberComplement = new NumberComplement();

    @Test
    public void test1() {
        assertEquals(2, numberComplement.findComplement(5));
        assertEquals(0, numberComplement.findComplement(1));
    }
}
