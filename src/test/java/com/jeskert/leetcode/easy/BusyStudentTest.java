package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusyStudentTest {

    BusyStudent busyStudent = new BusyStudent();

    @Test
    public void test1() {
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;
        assertEquals(1, busyStudent.busyStudent(startTime, endTime, queryTime));
    }

    @Test
    public void test2() {
        int[] startTime = new int[]{4};
        int[] endTime = new int[]{4};
        int queryTime = 4;
        assertEquals(1, busyStudent.busyStudent(startTime, endTime, queryTime));
    }

    @Test
    public void test3() {
        int[] startTime = new int[]{4};
        int[] endTime = new int[]{4};
        int queryTime = 5;
        assertEquals(0, busyStudent.busyStudent(startTime, endTime, queryTime));
    }

    @Test
    public void test4() {
        int[] startTime = new int[]{1, 1, 1, 1};
        int[] endTime = new int[]{1, 3, 2, 4};
        int queryTime = 7;
        assertEquals(0, busyStudent.busyStudent(startTime, endTime, queryTime));
    }

    @Test
    public void test5() {
        int[] startTime = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] endTime = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
        int queryTime = 5;
        assertEquals(5, busyStudent.busyStudent(startTime, endTime, queryTime));
    }
}
