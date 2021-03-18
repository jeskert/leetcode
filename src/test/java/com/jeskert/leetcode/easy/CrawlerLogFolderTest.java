package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrawlerLogFolderTest {
    CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();

    @Test
    public void test1() {
        String[] logs = new String[]{"d1/","d2/","../","d21/","./"};
        assertEquals(2, crawlerLogFolder.minOperations(logs));
    }

    @Test
    public void test2() {
        String[] logs = new String[]{"d1/","d2/","./","d3/","../","d31/"};
        assertEquals(3, crawlerLogFolder.minOperations(logs));
    }

    @Test
    public void test3() {
        String[] logs = new String[]{"d1/","../","../","../"};
        assertEquals(0, crawlerLogFolder.minOperations(logs));
    }

}