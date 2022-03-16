package com.jeskert.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k <= 0 || n <= 0) {
            return res;
        }
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(n, k, 1, track);
        return res;
    }

    void backtrack(int n, int k, int start, LinkedList<Integer> track) {
        if (track.size() == k && !res.contains(track)) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = start; i <= n; i++) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            backtrack(n, k, i, track);
            track.removeLast();
        }
    }
}
