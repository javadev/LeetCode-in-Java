package com_github_leetcode;

import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("" + val);
        if (Objects.nonNull(next)) {
            ListNode current = next;
            while (current.next != null) {
                result.append(", ");
                result.append(current.val);
                current = current.next;
            }
            result.append(", ");
            result.append(current.val);
        }
        return result.toString();
    }
}
