package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncreasingDecreasingStringTest {

    IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();

    @Test
    public void test1() {
        String s = "aaaabbbbcccc";
        assertEquals("abccbaabccba", increasingDecreasingString.sortString(s));
    }

    @Test
    public void test2() {
        String s = "rat";
        assertEquals("art", increasingDecreasingString.sortString(s));
    }

    @Test
    public void test3() {
        String s = "leetcode";
        assertEquals("cdelotee", increasingDecreasingString.sortString(s));
    }

    @Test
    public void test4() {
        String s = "rat";
        assertEquals("art", increasingDecreasingString.sortString(s));
    }

    @Test
    public void test5() {
        String s = "spo";
        assertEquals("ops", increasingDecreasingString.sortString(s));
    }
}
