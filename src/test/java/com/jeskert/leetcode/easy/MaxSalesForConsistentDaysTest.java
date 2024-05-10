package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSalesForConsistentDaysTest {

    MaxSalesForConsistentDays maxSalesForConsistentDays = new MaxSalesForConsistentDays();

    @Test
    public void test1() {
        int[] sales = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maxSalesForConsistentDays.maxSales(sales));
    }

    @Test
    public void test2() {
        int[] sales = new int[]{5, 4, -1, 7, 8};
        assertEquals(23, maxSalesForConsistentDays.maxSales(sales));
    }
}