package com.jeskert.leetcode.easy;

public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int n1 = i;
            int ans = 0;
            while (n1 != 0) {
                ans += n1 & 1;
                n1 >>>= 1;
            }
            res[i] = ans;
        }
        return res;
    }

}
