package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    String[] stream;
    int ptr = 0;

    public OrderedStream(int n) {
        stream = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> list = new ArrayList<>();
        for (int i = ptr; i < stream.length; i++) {
            if (stream[i] == null) {
                break;
            } else {
                ptr++;
                list.add(stream[i]);
            }
        }
        return list;
    }
}
