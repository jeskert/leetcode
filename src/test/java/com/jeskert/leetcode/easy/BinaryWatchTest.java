package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryWatchTest {
    BinaryWatch binaryWatch = new BinaryWatch();

    @Test
    public void test1() {
        List<String> res = binaryWatch.readBinaryWatch(1);

    }

    @Test
    public void test2() {
        List<String> res = binaryWatch.readBinaryWatch(9);
        assertEquals(0, res.size());
    }
}