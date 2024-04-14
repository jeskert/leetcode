package com.jeskert.leetcode.pojo;

public class DLinkedNode {
    int key;
    int value;

    DLinkedNode prev;
    DLinkedNode next;

    public DLinkedNode(int k, int v) {
        key = k;
        value = v;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DLinkedNode prev) {
        this.prev = prev;
    }

    public DLinkedNode getNext() {
        return next;
    }

    public void setNext(DLinkedNode next) {
        this.next = next;
    }
}
