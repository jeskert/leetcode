package com.jeskert.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int[] dir: dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n
                        && mat[newX][newY] == -1) {
                    mat[newX][newY] = mat[x][y] + 1;
                    queue.offer(new int[] {newX, newY});
                }
            }
        }
        return mat;
    }
}
