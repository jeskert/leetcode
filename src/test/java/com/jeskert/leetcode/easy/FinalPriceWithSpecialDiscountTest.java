package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinalPriceWithSpecialDiscountTest {
    FinalPriceWithSpecialDiscount finalPriceWithSpecialDiscount = new FinalPriceWithSpecialDiscount();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, finalPriceWithSpecialDiscount.finalPrices(new int[]{8, 4, 6, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, finalPriceWithSpecialDiscount.finalPrices(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{9, 0, 1, 6}, finalPriceWithSpecialDiscount.finalPrices(new int[]{10, 1, 1, 6}));
    }
}
