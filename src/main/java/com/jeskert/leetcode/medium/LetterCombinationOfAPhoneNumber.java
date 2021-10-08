package com.jeskert.leetcode.medium;

import java.util.*;

public class LetterCombinationOfAPhoneNumber {
    Map<Character, List<Character>> letterMap = new HashMap<>() {
        {
            put('2', List.of('a', 'b', 'c'));
            put('3', List.of('d', 'e', 'f'));
            put('4', List.of('g', 'h', 'i'));
            put('5', List.of('j', 'k', 'l'));
            put('6', List.of('m', 'n', 'o'));
            put('7', List.of('p', 'q', 'r', 's'));
            put('8', List.of('t', 'u', 'v'));
            put('9', List.of('w', 'x', 'y', 'z'));
        }
    };
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        StringBuilder track = new StringBuilder();
        backtrack(track, 0, digits);
        return res;
    }

    public void backtrack(StringBuilder track, int index, String digits) {
        if (track.length() == digits.length()) {
            res.add(track.toString());
            return;
        }

        char digit = digits.charAt(index);
        List<Character> characters = letterMap.get(digit);
        for (int i = 0; i < characters.size(); i++) {
            track.append(characters.get(i));
            backtrack(track, index + 1, digits);
            track.deleteCharAt(index);
        }
    }

}
