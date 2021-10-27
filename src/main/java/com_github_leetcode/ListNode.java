package com_github_leetcode;

@SuppressWarnings("java:S1104")
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("" + val);
        if (next.next != null) {
            result.append(", ");
        }
        ListNode current = next;
        while (current.next != null) {
            result.append(current.val);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append(current.val);
        return result.toString();
    }
}
