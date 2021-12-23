package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int length = code.length;
        int[] res = new int[length];
        if (k > 0) {
            for (int i = 0; i < length; i++) {
                int sum = 0;
                for (int j = i + 1; j < i + 1 + k; j++) {
                    sum += code[j % length];
                }
                res[i] = sum;
            }
        }
        if (k == 0) {
            for (int i = 0; i < length; i++) {
                res[i] = 0;
            }
        }

        if (k < 0) {
            for (int i = 0; i < length; i++) {
                int sum = 0;
                for (int j = i - 1; j > i - 1 + k; j--) {
                    sum += code[Math.abs(j + length) % length];
                }
                res[i] = sum;
            }
        }
        return res;
    }
}
