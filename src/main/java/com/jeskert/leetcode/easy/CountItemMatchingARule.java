package com.jeskert.leetcode.easy;

import java.util.List;

public class CountItemMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int) items.stream().filter(item -> {
            switch (ruleKey) {
                case "type":
                    return ruleValue.equals(item.get(0));
                case "color":
                    return ruleValue.equals(item.get(1));
                case "name":
                    return ruleValue.equals(item.get(2));
            }
            return false;
        }).count();
    }

}
