package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeNeededToInformAllEmployeesTest {
    TimeNeededToInformAllEmployees timeNeededToInformAllEmployees = new TimeNeededToInformAllEmployees();

    @Test
    public void test1() {
        assertEquals(0, timeNeededToInformAllEmployees.numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
        assertEquals(1, timeNeededToInformAllEmployees.numOfMinutes(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0, 0}));
    }
}