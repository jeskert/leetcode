package com.jeskert.leetcode.medium;

import java.util.*;

public class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> indexMap;
    public RandomizedSet() {
        nums = new ArrayList<>();
        indexMap = new HashMap<>();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }
        nums.add(val);
        indexMap.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }
        int index = indexMap.get(val);
        int lastElement = nums.get(nums.size() - 1);
        nums.set(index, lastElement);
        indexMap.put(lastElement, index);
        nums.remove(nums.size() - 1);
        indexMap.remove(val);
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(nums.size());
        return nums.get(index);
    }
}
