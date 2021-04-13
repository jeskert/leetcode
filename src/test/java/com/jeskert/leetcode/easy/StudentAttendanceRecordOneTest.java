package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAttendanceRecordOneTest {
    StudentAttendanceRecordOne studentAttendanceRecordOne = new StudentAttendanceRecordOne();

    @Test
    public void test1() {
        assertTrue(studentAttendanceRecordOne.checkRecord("PPALLP"));
    }

    @Test
    public void test2() {
        assertFalse(studentAttendanceRecordOne.checkRecord("PPALLL"));
    }
}
