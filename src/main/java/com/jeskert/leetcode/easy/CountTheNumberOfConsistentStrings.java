package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words).filter(word -> word.chars().noneMatch(ch -> allowed.indexOf(ch) == -1)).count();
    }

}
