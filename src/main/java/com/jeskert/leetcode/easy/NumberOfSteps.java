package com.jeskert.leetcode.easy;

public class NumberOfSteps {
    public int numberOfSteps (int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = (num & 1) == 1 ? num & -2 : num >> 1;
        }
        return count;
    }
}
