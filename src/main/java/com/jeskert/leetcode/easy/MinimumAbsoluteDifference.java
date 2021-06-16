package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minimumAbsDifference = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minimumAbsDifference) {
                minimumAbsDifference = arr[i + 1] - arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minimumAbsDifference) {
                List<Integer> element = new ArrayList<>();
                element.add(arr[i]);
                element.add(arr[i + 1]);
                result.add(element);
            }
        }
        return result;
    }
}
