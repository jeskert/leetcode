package com.jeskert.leetcode.easy;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            char c = split[i].toLowerCase().charAt(0);
            String convert = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? split[i] + "ma" : split[i].substring(1) + split[i].charAt(0) + "ma") + "a".repeat(Math.max(0, i + 1));
            split[i] = convert;
        }
        return String.join(" ", split);
    }

}
