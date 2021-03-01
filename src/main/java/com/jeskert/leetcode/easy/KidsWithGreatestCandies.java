package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int value : candies) {
            if (value > max) {
                max = value;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
