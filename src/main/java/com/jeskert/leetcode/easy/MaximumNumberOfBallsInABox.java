package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MaximumNumberOfBallsInABox {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> boxMap = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = calSum(i);
            if (!boxMap.containsKey(sum)) {
                boxMap.put(sum, 1);
            } else {
                boxMap.put(sum, boxMap.get(sum) + 1);
            }
        }

        return boxMap.values().stream().max(Integer::compare).get();
    }

    private int calSum(int num) {
        String numStr = String.valueOf(num);
        return IntStream.range(0, numStr.length()).map(i -> numStr.charAt(i) - 48).sum();
    }
}
