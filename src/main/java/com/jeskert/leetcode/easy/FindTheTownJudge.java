package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        List<Integer> matchList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int inCnt = 0;
            int outCnt = 0;
            for (int[] singleTrust : trust) {
                if (singleTrust[0] == i) {
                    outCnt++;
                }
                if (singleTrust[1] == i) {
                    inCnt++;
                }
            }
            if (inCnt == n - 1 && outCnt == 0) {
                matchList.add(i);
            }
        }
        if (matchList.size() == 1) {
            return matchList.get(0);
        } else {
            return -1;
        }
    }
}
