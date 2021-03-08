package com.jeskert.leetcode.easy;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int currentEmptyBottles = 0;
        int totalDrinks = 0;
        int currentFullBottles = numBottles;
        while (currentFullBottles > 0) {
            totalDrinks += currentFullBottles;
            currentEmptyBottles += currentFullBottles;
            if (currentEmptyBottles >= numExchange) {
                currentFullBottles = currentEmptyBottles / numExchange;
                currentEmptyBottles = currentEmptyBottles % numExchange;
            } else {
                break;
            }
        }
        return totalDrinks;
    }
}
