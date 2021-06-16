package com.jeskert.leetcode.easy;

public class NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(convertDateToInt(date1) - convertDateToInt(date2));
    }

    private int convertDateToInt(String date) {
        int totalDays = 0;
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1].startsWith("0") ? split[1].substring(1) : split[1]);
        int day = Integer.parseInt(split[2].startsWith("0") ? split[2].substring(1) : split[2]);
        for (int i = 1971; i < year; i++) {
            totalDays += isLeap(i) ? 366 : 365;
        }
        for (int i = 0; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                totalDays += 31;
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                totalDays += 30;
            }
            if (i == 2) {
                totalDays += isLeap(year) ? 29 : 28;
            }
        }
        totalDays += day;
        return totalDays;
    }

    private boolean isLeap(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }
}
