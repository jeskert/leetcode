package com.jeskert.leetcode.easy;

import java.util.List;

public class RotatedDigits {
    public int rotatedDigits(int n) {
        List<Character> goodDigits = List.of('2', '5', '6', '9');
        List<Character> sameDigits = List.of('0', '1', '8');
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i, goodDigits, sameDigits)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGood(int num, List<Character> goodDigits, List<Character> sameDigits) {
        char[] digits = String.valueOf(num).toCharArray();
        boolean hasGoodDigits = false;
        for (char c : digits) {
            if (goodDigits.contains(c)) {
                hasGoodDigits = true;
                continue;
            }
            if (sameDigits.contains(c)) {
                continue;
            }
            return false;
        }
        return hasGoodDigits;
    }
}
