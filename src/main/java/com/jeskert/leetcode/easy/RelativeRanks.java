package com.jeskert.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        Integer[] rank = new Integer[length];
        for (int i = 0; i < length; i++) {
            rank[i] = score[i];
        }
        Arrays.sort(rank, Collections.reverseOrder());
        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                rankMap.put(rank[i], "Gold Medal");
            } else if (i == 1) {
                rankMap.put(rank[i], "Silver Medal");
            } else if (i == 2) {
                rankMap.put(rank[i], "Bronze Medal");
            } else {
                rankMap.put(rank[i], String.valueOf(i + 1));
            }
        }

        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = rankMap.get(score[i]);
        }
        return result;
    }
}
