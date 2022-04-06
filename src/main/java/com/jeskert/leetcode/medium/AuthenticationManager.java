package com.jeskert.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    int timeToLive;
    Map<String, Integer> tokens;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId)) {
            int time = tokens.get(tokenId);
            if (currentTime < time) {
                tokens.put(tokenId, currentTime + timeToLive);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        return (int) tokens.values().stream().filter(time -> currentTime < time).count();
    }
}
