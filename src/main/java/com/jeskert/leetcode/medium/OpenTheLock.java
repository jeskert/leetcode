package com.jeskert.leetcode.medium;

import java.util.*;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Set<String> deadendSet = new HashSet<>();
        Collections.addAll(deadendSet, deadends);
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        Set<String> visited = new HashSet<>();
        visited.add("0000");
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (deadendSet.contains(cur)) {
                    continue;
                }
                if (Objects.equals(cur, target)) {
                    return step;
                }
                for (int j = 0; j < 4; j++) {
                    String plus = plusOne(cur, j);
                    if (!visited.contains(plus)) {
                        queue.offer(plus);
                        visited.add(plus);
                    }
                    String minus = minusOne(cur, j);
                    if (!visited.contains(minus)) {
                        queue.offer(minus);
                        visited.add(minus);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }
}
