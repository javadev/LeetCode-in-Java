package com_github_leetcode.left_right;

@SuppressWarnings("java:S1104")
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + ",left=" + left + ",right=" + right + ",next=" + next + "}";
    }
}
