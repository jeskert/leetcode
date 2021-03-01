package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RichestCustomerWealthTest {

    @Test
    public void test1() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(6, richestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    public void test2() {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(10, richestCustomerWealth.maximumWealth(accounts));
    }
}
