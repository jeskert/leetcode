package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int index = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = index; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    res++;
                    index = j + 1;
                    break;
                }
            }
        }
        return res;
    }
}
