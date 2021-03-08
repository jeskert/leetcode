package com.jeskert.leetcode.easy;

public class WalkingRobotSimulation {

    private int currentX = 0;

    private int currentY = 0;

    private Direction dir = Direction.NORTH;

    public int robotSim(int[] commands, int[][] obstacles) {
        int res = 0;
        for (int command : commands) {
            if (command == -1) {
                dir = turnRight();
            } else if (command == -2) {
                dir = turnLeft();
            } else {
                for (int i = 0; i < command; i++) {
                    move();
                    if (idObstacle(obstacles)) {
                        unMove();
                        break;
                    }
                    res = Math.max(res, currentX * currentX + currentY * currentY);
                }
            }
        }
        return res;
    }

    private void move() {
        switch (dir) {
            case NORTH:
                currentY++;
                break;
            case WEST:
                currentX--;
                break;
            case SOUTH:
                currentY--;
                break;
            case EAST:
                currentX++;
                break;
            default:
                break;
        }
    }

    private void unMove() {
        switch (dir) {
            case NORTH:
                currentY--;
                break;
            case WEST:
                currentX++;
                break;
            case SOUTH:
                currentY++;
                break;
            case EAST:
                currentX--;
                break;
            default:
                break;
        }
    }

    private boolean idObstacle(int[][] obstacles) {
        for (int[] obstacle : obstacles) {
            if (currentX == obstacle[0] && currentY == obstacle[1]) {
                return true;
            }
        }
        return false;
    }

    private Direction turnLeft() {
        switch (dir) {
            case NORTH:
                return Direction.WEST;
            case WEST:
                return Direction.SOUTH;
            case SOUTH:
                return Direction.EAST;
            case EAST:
                return Direction.NORTH;
            default:
                return dir;
        }
    }

    private Direction turnRight() {
        switch (dir) {
            case NORTH:
                return Direction.EAST;
            case WEST:
                return Direction.NORTH;
            case SOUTH:
                return Direction.WEST;
            case EAST:
                return Direction.SOUTH;
            default:
                return dir;
        }
    }

    private enum Direction {
        EAST, NORTH, SOUTH, WEST
    }
}
