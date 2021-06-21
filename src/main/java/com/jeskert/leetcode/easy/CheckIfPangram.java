package com.jeskert.leetcode.easy;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        int[] check = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (check[c - 97] == 0) {
                check[c - 97] = 1;
            }
        }
        int cnt = 0;
        for (int j : check) {
            if (j == 1) {
                cnt++;
            }
        }
        return cnt == 26;
    }
}
