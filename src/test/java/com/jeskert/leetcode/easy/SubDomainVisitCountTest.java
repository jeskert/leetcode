package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubDomainVisitCountTest {
    SubDomainVisitCount subDomainVisitCount = new SubDomainVisitCount();

    @Test
    public void test1() {
        String[] cpdomains = new String[]{"9001 discuss.leetcode.com"};
        List<String> res = subDomainVisitCount.subdomainVisits(cpdomains);
        assertTrue(res.contains("9001 discuss.leetcode.com"));
        assertTrue(res.contains("9001 leetcode.com"));
        assertTrue(res.contains("9001 com"));
    }

    @Test
    public void test2() {
        String[] cpdomains = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> res = subDomainVisitCount.subdomainVisits(cpdomains);
        assertTrue(res.contains("50 yahoo.com"));
        assertTrue(res.contains("900 google.mail.com"));
        assertTrue(res.contains("5 wiki.org"));
        assertTrue(res.contains("5 org"));
        assertTrue(res.contains("1 intel.mail.com"));
        assertTrue(res.contains("951 com"));
        assertTrue(res.contains("901 mail.com"));
    }
}
