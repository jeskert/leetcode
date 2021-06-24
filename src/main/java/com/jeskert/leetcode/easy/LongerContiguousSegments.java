package com.jeskert.leetcode.easy;

public class LongerContiguousSegments {
    public boolean checkZeroOnes(String s) {
        int mx0 = 0;
        int mx1 = 1;
        char prev = '#';
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == prev) {
                cnt++;
            } else {
                if (prev == 0) {
                    mx0 = Math.max(mx0, cnt);
                } else if (prev == 1) {
                    mx1 = Math.max(mx1, cnt);
                }
                cnt = 1;
            }
            prev = ch;
        }
        if (prev == '0') {
            mx0 = Math.max(mx0, cnt);
        } else if (prev == '1') {
            mx1 = Math.max(mx1, cnt);
        }
        return mx0 < mx1;
    }
}
