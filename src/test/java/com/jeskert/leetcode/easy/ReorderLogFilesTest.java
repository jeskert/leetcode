package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderLogFilesTest {
    ReorderLogFiles reorderLogFiles = new ReorderLogFiles();

    @Test
    public void test1() {
        String[] logs = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] res = new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        assertArrayEquals(res, reorderLogFiles.reorderLogFiles(logs));
    }

    @Test
    public void test2() {
        String[] logs = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] res = new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(res, reorderLogFiles.reorderLogFiles(logs));
    }
}
