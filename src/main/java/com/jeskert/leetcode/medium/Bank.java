package com.jeskert.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<Integer, Long> balanceMap;

    public Bank(long[] balance) {
        balanceMap = new HashMap<>();
        for (int i = 0; i < balance.length; i++) {
            balanceMap.put(i + 1, balance[i]);
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!balanceMap.containsKey(account1) || !balanceMap.containsKey(account2)) {
            return false;
        }
        Long currentBalance = balanceMap.get(account1);
        if (currentBalance < money) {
            return false;
        }
        balanceMap.put(account1, currentBalance - money);
        balanceMap.put(account2, balanceMap.get(account2) + money);
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!balanceMap.containsKey(account)) {
            return false;
        }
        balanceMap.put(account, balanceMap.get(account) + money);
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!balanceMap.containsKey(account)) {
            return false;
        }
        Long currentBalance = balanceMap.get(account);
        if (currentBalance < money) {
            return false;
        }
        balanceMap.put(account, currentBalance - money);
        return true;
    }
}
