package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseKeyFormattingTest {
    LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();

    @Test
    public void test1() {
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("24-A0R-74K", licenseKeyFormatting.licenseKeyFormatting("2-4A0r7-4k", 3));
        assertEquals("2", licenseKeyFormatting.licenseKeyFormatting("2", 2));
    }
}