package com.jeskert.leetcode.easy;

public class FindNearestPointHasSameCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallestManhattanDistance = -1;
        int smallestIndex = -1;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int manhattanDistance = Math.abs(point[0] - x) + Math.abs(point[1] - y);
                if (smallestManhattanDistance == -1 || manhattanDistance < smallestManhattanDistance) {
                    smallestManhattanDistance = manhattanDistance;
                    smallestIndex = i;
                }
            }
        }
        return smallestIndex;
    }
}
