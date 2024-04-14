package com.jeskert.leetcode.medium;

import com.jeskert.leetcode.pojo.DLinkedNode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {



    private final int capacity;

    private final Map<Integer, DLinkedNode> keyToNode = new HashMap<>();

    private final DLinkedNode dummy = new DLinkedNode(0, 0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dummy.setNext(dummy);
        dummy.setPrev(dummy);
    }

    public int get(int key) {
        DLinkedNode node = getNode(key);
        return node != null ? node.getValue() : -1;
    }

    public void put(int key, int value) {
        DLinkedNode node = getNode(key);
        if (node != null) {
            node.setValue(value);
            return;
        }
        if (keyToNode.size() >= capacity) {
            DLinkedNode last = dummy.getPrev();
            removeNode(last);
            keyToNode.remove(last.getKey());
        }

        DLinkedNode newNode = new DLinkedNode(key, value);
        pushFront(newNode);
        keyToNode.put(key, newNode);
    }

    private DLinkedNode getNode(int key) {
        if (!keyToNode.containsKey(key)) {
            return null;
        }
        DLinkedNode node = keyToNode.get(key);
        removeNode(node);
        pushFront(node);
        return node;
    }

    private void removeNode(DLinkedNode x) {
        x.getPrev().setNext(x.getNext());
        x.getNext().setPrev(x.getPrev());
    }

    private void pushFront(DLinkedNode x) {
        x.setPrev(dummy);
        x.setNext(dummy.getNext());
        x.getPrev().setNext(x);
        x.getNext().setPrev(x);
    }
}
