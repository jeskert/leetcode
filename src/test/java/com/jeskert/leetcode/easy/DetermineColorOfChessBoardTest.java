package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;
public class DetermineColorOfChessBoardTest {

    DetermineColorOfChessBoard determineColorOfChessBoard = new DetermineColorOfChessBoard();
    @Test
    public void squareIsWhite() {
        assertFalse(determineColorOfChessBoard.squareIsWhite("a1"));
        assertTrue(determineColorOfChessBoard.squareIsWhite("h3"));
        assertFalse(determineColorOfChessBoard.squareIsWhite("c7"));
    }
}