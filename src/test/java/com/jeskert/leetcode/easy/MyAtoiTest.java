package com.jeskert.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAtoiTest {

    private MyAtoi myAtoi;

    @Before
    public void setUp() {
        myAtoi = new MyAtoi();
    }

    @Test
    public void should_return_numeric_integer_when_provide_a_numeric_string() {
        assertEquals(42, myAtoi.myAtoi("42"));
    }

    @Test
    public void should_return_signed_int_given_signed_string_with_space() {
        assertEquals(-42, myAtoi.myAtoi("    -42"));
    }

    @Test
    public void should_return_signed_int_given_a_string_with_other_letters() {
        assertEquals(4193, myAtoi.myAtoi("4193 with words"));
    }

    @Test
    public void should_return_zero_given_a_string_start_with_other_letters() {
        assertEquals(0, myAtoi.myAtoi("words and 987"));
    }
}