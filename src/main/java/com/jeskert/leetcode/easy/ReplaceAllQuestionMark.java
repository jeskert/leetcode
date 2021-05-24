package com.jeskert.leetcode.easy;

public class ReplaceAllQuestionMark {
    public String modifyString(String s) {
        StringBuilder builder = new StringBuilder();
        if (s.equals("?")) {
            return "a";
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '?') {
                    if (i == s.length() - 1) {
                        builder.append(selectCharacter(s.charAt(i - 1), s.charAt(i - 1)));
                    } else if (i == 0) {
                        builder.append(selectCharacter(s.charAt(i + 1), s.charAt(i + 1)));
                    } else {
                        builder.append(selectCharacter(builder.toString().charAt(i - 1), s.charAt(i + 1)));
                    }
                } else {
                    builder.append(s.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    private char selectCharacter(char pre, char pos) {
        char temp = 'a';
        while (temp == pre || temp == pos) {
            temp = (char) (temp + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        ReplaceAllQuestionMark replaceAllQuestionMark = new ReplaceAllQuestionMark();

        System.out.println(replaceAllQuestionMark.modifyString("?zs"));
    }
}
