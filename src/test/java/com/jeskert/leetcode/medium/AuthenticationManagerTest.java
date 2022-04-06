package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticationManagerTest {
    @Test
    public void test1() {
        AuthenticationManager authenticationManager = new AuthenticationManager(5);
        authenticationManager.renew("aaa", 1);
        authenticationManager.generate("aaa", 2);
        assertEquals(1, authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("bbb", 7);
        authenticationManager.renew("aaa", 8);
        authenticationManager.renew("bbb", 10);
        assertEquals(0, authenticationManager.countUnexpiredTokens(15));
    }
}