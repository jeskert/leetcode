package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalanceStringSplitTest {

    BalanceStringSplit balanceStringSplit = new BalanceStringSplit();

    @Test
    public void test1() {
        assertEquals(4, balanceStringSplit.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void test2() {
        assertEquals(3, balanceStringSplit.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void test3() {
        assertEquals(1, balanceStringSplit.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void test4() {
        assertEquals(2, balanceStringSplit.balancedStringSplit("RLRRRLLRLL"));
    }
}
