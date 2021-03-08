package com.jeskert.leetcode.easy;

public class VerifyingAlienCode {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            if (!biggerThan(words[i + 1], words[i], order)) {
                return false;
            }
        }
        return true;
    }

    private boolean biggerThan(String word1, String word2, String order) {
        int currentIndex = 0;
        int minLength = Math.min(word1.length(), word2.length());
        while (currentIndex < minLength) {
            int word1Order = order.indexOf(String.valueOf(word1.charAt(currentIndex)));
            int word2Order = order.indexOf(String.valueOf(word2.charAt(currentIndex)));
            if (word1Order == word2Order) {
                currentIndex++;
            } else {
                return word1Order > word2Order;
            }
        }
        return word1.length() >= word2.length();
    }
}
