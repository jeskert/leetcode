package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDaysBetweenTwoDatesTest {
    NumberOfDaysBetweenTwoDates numberOfDaysBetweenTwoDates = new NumberOfDaysBetweenTwoDates();

    @Test
    public void test1() {
        assertEquals(1, numberOfDaysBetweenTwoDates.daysBetweenDates("2019-06-29", "2019-06-30"));
        assertEquals(15, numberOfDaysBetweenTwoDates.daysBetweenDates("2020-01-15", "2019-12-31"));
        assertEquals(40006, numberOfDaysBetweenTwoDates.daysBetweenDates("2100-09-22", "1991-03-12"));
    }
}
