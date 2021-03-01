package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumbersTest {

    GuessNumbers guessNumbers = new GuessNumbers();

    @Test
    public void test1() {
        int[] guess = new int[]{1, 2, 3};
        int[] answer = new int[]{1, 2, 3};
        assertEquals(3, guessNumbers.game(guess, answer));
    }

    @Test
    public void test2() {
        int[] guess = new int[]{2, 2, 3};
        int[] answer = new int[]{3, 2, 1};
        assertEquals(1, guessNumbers.game(guess, answer));
    }
}
