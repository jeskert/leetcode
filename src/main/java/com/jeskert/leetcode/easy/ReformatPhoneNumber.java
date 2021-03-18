package com.jeskert.leetcode.easy;

public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        number = number.replaceAll("-", "").replaceAll(" ", "");
        StringBuilder res = new StringBuilder();
        while (number.length() > 0) {
            if (number.length() > 4) {
                res.append(number.substring(0, 3)).append("-");
                number = number.substring(3);
            } else if (number.length() == 4) {
                res.append(number.substring(0, 2)).append("-").append(number.substring(2, 4));
                number = "";
            } else {
                res.append(number);
                number = "";
            }
        }
        return res.toString();
    }
}
