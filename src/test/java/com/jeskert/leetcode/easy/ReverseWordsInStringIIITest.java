package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringIIITest {
    ReverseWordsInStringIII reverseWordsInStringIII = new ReverseWordsInStringIII();

    @Test
    public void test1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsInStringIII.reverseWords("Let's take LeetCode contest"));
    }
}
