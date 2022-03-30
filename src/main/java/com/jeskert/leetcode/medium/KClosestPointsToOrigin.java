package com.jeskert.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        int count = points.length;
        Queue<int[]> priorityQueue = new PriorityQueue<>(count, Comparator.comparing(point -> (point[0] * point[0] + point[1] * point[1])));
        priorityQueue.addAll(Arrays.asList(points));
        int[][] res = new int[k][];
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue.poll();
        }
        return res;
    }
}
