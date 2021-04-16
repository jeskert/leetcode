package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringMatchingInAnArrayTest {
    StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();

    @Test
    public void test1() {
        String[] words = new String[]{"mass", "as", "hero", "superhero"};
        assertArrayEquals(new String[]{"as", "hero"}, stringMatchingInAnArray.stringMatching(words).toArray());
    }

    @Test
    public void test2() {
        String[] words = new String[]{"leetcode", "et", "code"};
        assertArrayEquals(new String[]{"et", "code"}, stringMatchingInAnArray.stringMatching(words).toArray());
    }

    @Test
    public void test3() {
        String[] words = new String[]{"blue", "green", "bu"};
        assertArrayEquals(new String[]{}, stringMatchingInAnArray.stringMatching(words).toArray());
    }

    @Test
    public void test4() {
        String[] words = new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"};
        assertArrayEquals(new String[]{"leetcode", "od", "am"}, stringMatchingInAnArray.stringMatching(words).toArray());
    }
}
