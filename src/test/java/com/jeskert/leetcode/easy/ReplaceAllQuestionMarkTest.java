package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllQuestionMarkTest {
    ReplaceAllQuestionMark replaceAllQuestionMark = new ReplaceAllQuestionMark();

    @Test
    public void test1() {
        assertEquals("azs", replaceAllQuestionMark.modifyString("?zs"));
        assertEquals("ubvaw", replaceAllQuestionMark.modifyString("ubv?w"));
        assertEquals("jaqgacb", replaceAllQuestionMark.modifyString("j?qg??b"));
        assertEquals("abywaipkja", replaceAllQuestionMark.modifyString("??yw?ipkj?"));
    }
}
