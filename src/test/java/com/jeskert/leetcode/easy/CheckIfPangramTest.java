package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfPangramTest {
    CheckIfPangram checkIfPangram = new CheckIfPangram();

    @Test
    public void test1() {
        assertTrue(checkIfPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        assertFalse(checkIfPangram.checkIfPangram("leetcode"));
    }
}