package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int divide = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (divide == 0 || num % divide != 0) {
                return false;
            }
        }
        return true;
    }
}
