package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestLetterGreaterThanTargetTest {
    FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();

    @Test
    public void test1() {
        assertEquals('c', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        assertEquals('f', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        assertEquals('f', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }
}