package com.jeskert.leetcode.easy;

public class NumberOfStudentUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] nums = new int[2];
        for (int s : students) {
            nums[s]++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (nums[sandwiches[i]] == 0) {
                return students.length - i;
            }
            nums[sandwiches[i]]--;
        }
        return 0;
    }
}
