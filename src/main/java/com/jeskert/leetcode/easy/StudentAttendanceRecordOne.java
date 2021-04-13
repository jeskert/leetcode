package com.jeskert.leetcode.easy;

public class StudentAttendanceRecordOne {
    public boolean checkRecord(String s) {
        int aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aCount++;
            }
        }
        return aCount <= 1 && !s.contains("LLL");
    }
}
