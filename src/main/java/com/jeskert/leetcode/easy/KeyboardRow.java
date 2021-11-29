package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        return Arrays.stream(words).filter(this::canPrintByOneRow).toArray(String[]::new);
    }

    private boolean canPrintByOneRow(String word) {
        word = word.toLowerCase();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        String[] rows = new String[]{row1, row2, row3};
        String row = "";
        for (String givenRow : rows) {
            if (givenRow.indexOf(word.charAt(0)) != -1) {
                row = givenRow;
            }
        }
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
