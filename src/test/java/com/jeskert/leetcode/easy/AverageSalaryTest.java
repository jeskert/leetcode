package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageSalaryTest {
    AverageSalary averageSalary = new AverageSalary();

    @Test
    public void test1() {
        assertEquals(2500.00000, averageSalary.average(new int[]{4000, 3000, 1000, 2000}), 0.00001);
        assertEquals(2000.00000, averageSalary.average(new int[]{3000, 1000, 2000}), 0.00001);
        assertEquals(3500.00000, averageSalary.average(new int[]{6000, 5000, 4000, 3000, 1000, 2000}), 0.00001);
        assertEquals(4750.00000, averageSalary.average(new int[]{8000, 9000, 2000, 3000, 1000, 6000}), 0.00001);
        assertEquals(41111.11111, averageSalary.average(new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}), 0.00001);
    }
}