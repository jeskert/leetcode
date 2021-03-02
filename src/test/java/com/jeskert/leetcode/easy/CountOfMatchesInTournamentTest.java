package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOfMatchesInTournamentTest {
    CountOfMatchesInTournament countOfMatchesInTournament = new CountOfMatchesInTournament();

    @Test
    public void test1() {
        assertEquals(6, countOfMatchesInTournament.numberOfMatches(7));
    }

    @Test
    public void test2() {
        assertEquals(13, countOfMatchesInTournament.numberOfMatches(14));
    }
}
