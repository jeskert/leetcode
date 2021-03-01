package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoalParserInterpretationTest {

    GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

    @Test
    public void test1() {
        String command = "G()(al)";
        assertEquals("Goal", goalParserInterpretation.interpret(command));
    }

    @Test
    public void test2() {
        String command = "G()()()()(al)";
        assertEquals("Gooooal", goalParserInterpretation.interpret(command));
    }

    @Test
    public void test3() {
        String command = "(al)G(al)()()G";
        assertEquals("alGalooG", goalParserInterpretation.interpret(command));
    }
}
