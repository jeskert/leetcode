package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

public class GroupAnagramsTest {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void test1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = groupAnagrams.groupAnagrams(strs);
        System.out.println(res);
    }

    @Test
    public void test2() {
        String[] strs = new String[]{""};
        List<List<String>> res = groupAnagrams.groupAnagrams(strs);
        System.out.println(res);
    }
}