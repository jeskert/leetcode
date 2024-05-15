package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {
    CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    public void test1() {
        int[][] prerequisites = {{1, 0}};
        assertTrue(courseSchedule.canFinish(2, prerequisites));
    }

    @Test
    public void test2() {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(courseSchedule.canFinish(2, prerequisites));
    }

    @Test
    public void test3() {
        int[][] prerequisites = {{0, 1}, {1, 2}, {1, 3}, {2, 3}, {3, 4}, {4, 0}};
        assertFalse(courseSchedule.canFinish(5, prerequisites));
    }

    @Test
    public void test4() {
        int[][] prerequisites = {{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}};
        assertFalse(courseSchedule.canFinish(20, prerequisites));
    }

    @Test
    public void test5() {
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        assertTrue(courseSchedule.canFinish(4, prerequisites));
    }
}