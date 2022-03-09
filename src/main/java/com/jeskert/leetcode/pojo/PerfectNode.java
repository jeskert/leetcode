package com.jeskert.leetcode.pojo;

public class PerfectNode {
    public int val;
    public PerfectNode left;
    public PerfectNode right;
    public PerfectNode next;

    public PerfectNode() {

    }

    public PerfectNode(int _val) {
        this.val = _val;
    }

    public PerfectNode(int _val, PerfectNode _left, PerfectNode _right, PerfectNode _next) {
        this.val = _val;
        this.left = _left;
        this.right = _right;
        this.next = _next;
    }
}
