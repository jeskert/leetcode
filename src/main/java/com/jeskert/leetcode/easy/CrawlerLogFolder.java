package com.jeskert.leetcode.easy;

import java.util.Stack;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Stack<String> level = new Stack<>();
        for (String log : logs) {
            switch (log) {
                case "../":
                    if (level.isEmpty()) {
                        break;
                    }
                    level.pop();
                    break;
                case "./":
                    break;
                default:
                    level.push(log);
            }
        }
        return level.size();
    }
}
