package com.jeskert.leetcode.easy;

public class DefangAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
