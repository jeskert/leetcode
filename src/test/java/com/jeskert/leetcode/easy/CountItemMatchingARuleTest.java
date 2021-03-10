package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountItemMatchingARuleTest {
    CountItemMatchingARule countItemMatchingARule = new CountItemMatchingARule();

    @Test
    public void test1() {
        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        assertEquals(1, countItemMatchingARule.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void test2() {
        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        assertEquals(2, countItemMatchingARule.countMatches(items, ruleKey, ruleValue));
    }
}