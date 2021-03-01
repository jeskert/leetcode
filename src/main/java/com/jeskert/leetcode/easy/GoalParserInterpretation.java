package com.jeskert.leetcode.easy;

public class GoalParserInterpretation {

    public String interpret(String command) {
        int index = 0;
        StringBuilder strBuilder = new StringBuilder();
        while (index < command.length()) {
            String nextOneChar = command.substring(index, index + 1);
            if (nextOneChar.equals("G")) {
                strBuilder.append("G");
                index += 1;
            } else {
                String nextTwoChars = command.substring(index, index + 2);
                if ("()".equals(nextTwoChars)) {
                    strBuilder.append("o");
                    index += 2;
                } else if ("(a".equals(nextTwoChars)) {
                    strBuilder.append("al");
                    index += 4;
                }
            }
        }
        return strBuilder.toString();
    }
}
