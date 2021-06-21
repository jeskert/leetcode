package com.jeskert.leetcode.easy;

public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convert(targetWord) == convert(firstWord) + convert(secondWord);
    }

    private int convert(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - 97 + '0');
        }
        return Integer.parseInt(new String(arr));
    }
}
