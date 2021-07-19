package com.jeskert.leetcode.easy;

public class InsertIntoBits {
    public int insertBits(int N, int M, int i, int j) {
        return N & (~(((1 << (j - i + 1)) - 1) << i)) | (M << i);
    }
}
