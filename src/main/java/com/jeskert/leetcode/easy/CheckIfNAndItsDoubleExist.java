package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(2 * i)) {
                return true;
            }
            if (i % 2 == 0) {
                if (map.containsKey(i / 2)) {
                    return true;
                }
            }
            if (!map.containsKey(i)) {
                map.put(i, true);
            }
        }
        return false;
    }
}
