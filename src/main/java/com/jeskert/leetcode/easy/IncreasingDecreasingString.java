package com.jeskert.leetcode.easy;

public class IncreasingDecreasingString {

    public String sortString(String s) {
        int[] bucket = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            bucket[c - 'a']++;
        }

        char[] res = new char[s.length()];
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (bucket[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    bucket[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (bucket[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    bucket[i]--;
                }
            }
        }
        return new String(res);
    }
}
