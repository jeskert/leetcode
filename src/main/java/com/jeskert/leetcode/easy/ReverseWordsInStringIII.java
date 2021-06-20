package com.jeskert.leetcode.easy;

public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(basicReverse(words[i]));
            if (i != words.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }

    private String basicReverse(String str) {
        char[] s = str.toCharArray();
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
        return new String(s);
    }
}
