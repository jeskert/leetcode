package com.jeskert.leetcode.easy;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        return time(n);
    }

    private int time(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 1) {
            return (n - 1) / 2 + time((n - 1) / 2 + 1);
        }
        return n / 2 + time(n / 2);
    }
}
