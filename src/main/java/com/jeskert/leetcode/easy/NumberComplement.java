package com.jeskert.leetcode.easy;

public class NumberComplement {
    public int findComplement(int num) {
        return (int) (Math.pow(2, Integer.toBinaryString(num).length()) - 1) ^ num;
    }
}
