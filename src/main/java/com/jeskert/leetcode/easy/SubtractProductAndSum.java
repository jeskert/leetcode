package com.jeskert.leetcode.easy;

public class SubtractProductAndSum {

    public int subtractProductAndSum(int n) {
        String[] split = String.valueOf(n).split("");
        int sum = 0;
        int product = 1;
        for (String s : split) {
            int i = Integer.parseInt(s);
            sum += i;
            product *= i;
        }
        return product - sum;
    }
}
