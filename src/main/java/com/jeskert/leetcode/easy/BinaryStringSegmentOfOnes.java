package com.jeskert.leetcode.easy;

public class BinaryStringSegmentOfOnes {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
