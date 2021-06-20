package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumPopulationYearTest {
    MaximumPopulationYear maximumPopulationYear = new MaximumPopulationYear();

    @Test
    public void test1() {
        int[][] logs = new int[][]{{1993, 1999}, {2000, 2010}};
        assertEquals(1993, maximumPopulationYear.maximumPopulation(logs));
    }
    @Test
    public void test2() {
        int[][] logs = new int[][]{{1950, 1961}, {1960, 1971}, {1970,1981}};
        assertEquals(1960, maximumPopulationYear.maximumPopulation(logs));
    }

}