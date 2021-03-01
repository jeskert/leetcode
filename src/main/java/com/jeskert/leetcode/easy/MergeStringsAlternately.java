package com.jeskert.leetcode.easy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int commonLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < commonLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append((word1.length() > word2.length() ? word1 : word2).substring(commonLength));
        return sb.toString();
    }
}
