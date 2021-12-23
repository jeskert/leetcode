package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            if (ransomNoteMap.containsKey(c)) {
                ransomNoteMap.put(c, ransomNoteMap.get(c) + 1);
            } else {
                ransomNoteMap.put(c, 1);
            }
        }
        for (Character c : magazine.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            } else {
                magazineMap.put(c, 1);
            }
        }
        for (Character c : ransomNoteMap.keySet()) {
            Integer noteCnt = ransomNoteMap.get(c);
            Integer magazineCnt = magazineMap.get(c);
            if (magazineCnt == null || magazineCnt < noteCnt) {
                return false;
            }
        }
        return true;
    }
}
