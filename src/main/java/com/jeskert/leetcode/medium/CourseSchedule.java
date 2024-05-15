package com.jeskert.leetcode.medium;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }
        Map<Integer, List<Integer>> graph = new LinkedHashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (prerequisite[0] == prerequisite[1]) {
                return false;
            }
            List<Integer> list = graph.getOrDefault(prerequisite[1], new LinkedList<>());
            list.add(prerequisite[0]);
            graph.put(prerequisite[1], list);
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(0);
        visited.add(0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                Integer i = queue.poll();
                if (graph.containsKey(i)) {
                    List<Integer> neighbors = graph.get(i);
                    for (int neighbor : neighbors) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        } else {
                            return false;
                        }
                        visited.add(neighbor);
                    }
                }
            }
        }
        return true;
    }
}
