package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] splitBySpace = cpdomain.split(" ");
            int count = Integer.parseInt(splitBySpace[0]);
            String domain = splitBySpace[1];
            List<String> domains = new ArrayList<>();
            domains.add(domain);
            for (int i = 0; i < domain.length(); i++) {
                if (domain.charAt(i) == '.') {
                    domains.add(domain.substring(i + 1));
                }
            }
            for (String subDomain : domains) {
                if (countMap.containsKey(subDomain)) {
                    countMap.put(subDomain, countMap.get(subDomain) + count);
                } else {
                    countMap.put(subDomain, count);
                }
            }
        }
        for (String key : countMap.keySet()) {
            res.add(countMap.get(key) + " " + key);
        }
        return res;
    }
}
