package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateMoneyInLeetCodeBankTest {
    CalculateMoneyInLeetCodeBank calculateMoneyInLeetCodeBank = new CalculateMoneyInLeetCodeBank();

    @Test
    public void test1() {
        assertEquals(10, calculateMoneyInLeetCodeBank.totalMoney(4));
    }

    @Test
    public void test2() {
        assertEquals(37, calculateMoneyInLeetCodeBank.totalMoney(10));
    }

    @Test
    public void test3() {
        assertEquals(96, calculateMoneyInLeetCodeBank.totalMoney(20));
    }
}