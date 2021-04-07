package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result = 0;
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        int currentBoxes = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (boxTypes[i][0] <= truckSize - currentBoxes) {
                currentBoxes += boxTypes[i][0];
                result += boxTypes[i][0] * boxTypes[i][1];
            } else {
                if (truckSize - currentBoxes != 0) {
                    result += boxTypes[i][1] * (truckSize - currentBoxes);
                    currentBoxes = truckSize;
                }
            }
        }
        return result;

    }
}
