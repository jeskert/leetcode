package com.jeskert.leetcode.easy;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String sourceString = s.replaceAll("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int index = sourceString.length() % k;
        if (index > 0) {
            sb.append(sourceString, 0, index);
        }
        if (index != sourceString.length() && index != 0) {
            sb.append("-");
        }
        int size = (sourceString.length() - index) / k;
        for (int i = 0; i < size; i++) {
            sb.append(sourceString, index, index + k);
            index += k;
            if (i < size - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }
}
