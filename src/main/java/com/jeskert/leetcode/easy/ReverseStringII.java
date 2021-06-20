package com.jeskert.leetcode.easy;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= s.length(); i += 2 * k) {
            result.append(reversePart(i + 2 * k > s.length() ? s.substring(i) : s.substring(i, i + 2 * k), k));
        }
        return result.toString();
    }

    private String reversePart(String sub, int k) {
        if (sub.length() < k) {
            return basicReverse(sub);
        }
        return basicReverse(sub.substring(0, k)) + sub.substring(k);
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
