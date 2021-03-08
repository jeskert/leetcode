package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalkingRobotSimulationTest {

    WalkingRobotSimulation walkingRobotSimulation = new WalkingRobotSimulation();

    @Test
    public void test1() {
        int[] commands = new int[]{4, -1, 3};
        int[][] obstacles = new int[][]{};
        assertEquals(25, walkingRobotSimulation.robotSim(commands, obstacles));
    }

    @Test
    public void test2() {
        int[] commands = new int[]{4, -1, 4, -2, 4};
        int[][] obstacles = new int[][]{{2, 4}};
        assertEquals(65, walkingRobotSimulation.robotSim(commands, obstacles));
    }

    @Test
    public void test3() {
        int[] commands = new int[]{7, -2, -2, 7, 5};
        int[][] obstacles = new int[][]{{-3, 2}, {-2, 1}, {0, 1}, {-2, 4}, {-1, 0}, {-2, -3}, {0, -3}, {4, 4}, {-3, 3}, {2, 2}};
        assertEquals(4, walkingRobotSimulation.robotSim(commands, obstacles));
    }
}