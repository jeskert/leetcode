package com.jeskert.leetcode.easy;

import java.util.stream.IntStream;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        return (char) (IntStream.range(0, t.length()).map(t::charAt).sum() - IntStream.range(0, s.length()).map(s::charAt).sum());
    }
}
