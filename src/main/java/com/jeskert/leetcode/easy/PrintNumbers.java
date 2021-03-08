package com.jeskert.leetcode.easy;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        StringBuilder maxStr = new StringBuilder();
        maxStr.append("9".repeat(Math.max(0, n)));
        int max = Integer.parseInt(maxStr.toString());
        int[] res = new int[max];
        for (int i = 1; i <= max; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
