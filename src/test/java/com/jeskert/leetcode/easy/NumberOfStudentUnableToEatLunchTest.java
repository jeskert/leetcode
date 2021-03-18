package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStudentUnableToEatLunchTest {
    NumberOfStudentUnableToEatLunch numberOfStudentUnableToEatLunch = new NumberOfStudentUnableToEatLunch();

    @Test
    public void test1() {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};
        assertEquals(0, numberOfStudentUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    public void test2() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        assertEquals(3, numberOfStudentUnableToEatLunch.countStudents(students, sandwiches));
    }
}