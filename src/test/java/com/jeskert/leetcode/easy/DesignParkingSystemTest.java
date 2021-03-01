package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignParkingSystemTest {

    @Test
    public void test1() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        assertTrue(parkingSystem.addCar(1)); // 返回 true ，因为有 1 个空的大车位
        assertTrue(parkingSystem.addCar(2)); // 返回 true ，因为有 1 个空的中车位
        assertFalse(parkingSystem.addCar(3)); // 返回 false ，因为没有空的小车位
        assertFalse(parkingSystem.addCar(1)); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
    }
}
