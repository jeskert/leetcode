package com.jeskert.leetcode.easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizon = 0;
        int vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U':
                    horizon++;
                    break;
                case 'D':
                    horizon--;
                    break;
                case 'L':
                    vertical--;
                    break;
                case 'R':
                    vertical++;
                    break;
                default:
                    break;
            }
        }
        return horizon == 0 && vertical == 0;
    }
}
