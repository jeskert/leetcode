package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondLargestInStringTest {
    SecondLargestInString secondLargestInString = new SecondLargestInString();

    @Test
    public void test1() {
        assertEquals(2, secondLargestInString.secondHighest("dfa12321afd"));
        assertEquals(-1, secondLargestInString.secondHighest("abc1111"));
    }
}