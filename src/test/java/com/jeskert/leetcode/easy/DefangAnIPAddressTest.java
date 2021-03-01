package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefangAnIPAddressTest {

    DefangAnIPAddress defangAnIPAddress = new DefangAnIPAddress();

    @Test
    public void test1() {
        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1" ,defangAnIPAddress.defangIPaddr(address));
    }

    @Test
    public void test2() {
        String address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0" ,defangAnIPAddress.defangIPaddr(address));
    }
}
