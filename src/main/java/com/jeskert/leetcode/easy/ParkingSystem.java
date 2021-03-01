package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {

    private final Map<Integer, Integer> spotMap;

    public ParkingSystem(int big, int medium, int small) {
        spotMap = new HashMap<>();
        spotMap.put(1, big);
        spotMap.put(2, medium);
        spotMap.put(3, small);
    }

    public boolean addCar(int carType) {
        Integer currentSpot = spotMap.get(carType);
        if (currentSpot > 0) {
            spotMap.put(carType, currentSpot - 1);
            return true;
        } else {
            return false;
        }
    }
}
