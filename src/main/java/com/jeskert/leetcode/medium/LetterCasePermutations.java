package com.jeskert.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutations {

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder track = new StringBuilder();
        backtrack(res, s, track, 0);
        return res;
    }

    void backtrack(List<String> res, String s, StringBuilder track, int index) {
        if (track.length() == s.length()) {
            res.add(track.toString());
            return;
        }

        char cur = s.charAt(index);
        List<Character> choices;
        if (Character.isAlphabetic(cur)) {
            choices = List.of(Character.toLowerCase(cur), Character.toUpperCase(cur));
        } else {
            choices = List.of(cur);
        }
        for (Character c : choices) {
            track.append(c);
            backtrack(res, s, track, index + 1);
            track.deleteCharAt(track.length() - 1);
        }
    }
}
