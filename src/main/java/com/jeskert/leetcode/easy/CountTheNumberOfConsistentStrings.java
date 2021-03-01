package com.jeskert.leetcode.easy;

import java.util.Arrays;

/*
给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。

请你返回 words 数组中 一致字符串 的数目。
 */
public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words).filter(word -> word.chars().noneMatch(ch -> allowed.indexOf(ch) == -1)).count();
    }

}
