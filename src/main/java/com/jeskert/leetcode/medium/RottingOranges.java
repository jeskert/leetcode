package com.jeskert.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int orangesRotting(int[][] grid) {
        int M = grid.length;
        int N = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int round = 0;
        while (count > 0 && !queue.isEmpty()) {
            round++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] orange = queue.poll();
                for (int[] dir : dirs) {
                    int x = orange[0] + dir[0];
                    int y = orange[1] + dir[1];
                    if (x >= 0 && x < M && y >= 0 && y < N && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        count--;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }

        if (count > 0) {
            return -1;
        } else {
            return round;
        }
    }
}
