package com.jeskert.leetcode.easy;

public class XorOperationInArray {

    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res = start + 2 * i;
            } else {
                res = res ^ start + 2 * i;
            }
        }
        return res;
    }
}
