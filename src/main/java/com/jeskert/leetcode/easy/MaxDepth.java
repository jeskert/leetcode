package com.jeskert.leetcode.easy;

public class MaxDepth {

    public int maxDepth(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int max = 0;
        for (char c : str) {
            if (c == '(') left++;
            if (c == ')') left--;
            if (max < left) max = left;
        }
        return max;
    }
}
