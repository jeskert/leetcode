package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(2));
        list.add(List.of(3, 4));
        list.add(List.of(6, 5, 7));
        list.add(List.of(4, 1, 8, 3));
        assertEquals(11, triangle.minimumTotal(list));
    }

    @Test
    public void test2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-10));
        assertEquals(-10, triangle.minimumTotal(list));
    }
}