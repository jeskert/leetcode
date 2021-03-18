package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReformatPhoneNumberTest {
    ReformatPhoneNumber reformatPhoneNumber = new ReformatPhoneNumber();
    @Test
    public void test1() {
        assertEquals("123-456",  reformatPhoneNumber.reformatNumber("1-23-45 6"));
    }

    @Test
    public void test2() {
        assertEquals("123-45-67",  reformatPhoneNumber.reformatNumber("123 4-567"));
    }

    @Test
    public void test3() {
        assertEquals("123-456-78",  reformatPhoneNumber.reformatNumber("123 4-5678"));
    }

    @Test
    public void test4() {
        assertEquals("12",  reformatPhoneNumber.reformatNumber("12"));
    }

    @Test
    public void test5() {
        assertEquals("175-229-353-94-75",  reformatPhoneNumber.reformatNumber("--17-5 229 35-39475 "));
    }
}