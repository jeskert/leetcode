package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SelfDividingNumbersTest {

    SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();

    @Test
    public void test1() {
        List<Integer> integers = selfDividingNumbers.selfDividingNumbers(1, 22);
        assertTrue(integers.contains(1));
        assertTrue(integers.contains(2));
        assertTrue(integers.contains(3));
        assertTrue(integers.contains(4));
        assertTrue(integers.contains(5));
        assertTrue(integers.contains(6));
        assertTrue(integers.contains(7));
        assertTrue(integers.contains(8));
        assertTrue(integers.contains(9));
        assertTrue(integers.contains(11));
        assertTrue(integers.contains(12));
        assertTrue(integers.contains(15));
        assertTrue(integers.contains(22));
    }
}
