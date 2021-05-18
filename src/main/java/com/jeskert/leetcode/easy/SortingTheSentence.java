package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        Map<String, Integer> indexMap = new HashMap<>();
        for (String word : arr) {
            indexMap.put(word, Integer.valueOf(word.substring(word.length() - 1)));
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(indexMap.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        return entries.stream().map(entry -> entry.getKey().substring(0, entry.getKey().length() - 1)).collect(Collectors.joining(" "));
    }
}
