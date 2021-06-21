package com.jeskert.leetcode.easy;

public class DetermineColorOfChessBoard {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - 96 + coordinates.charAt(1) - '0') % 2 == 1;
    }
}
