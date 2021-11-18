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
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) return false;
        ListNode other = (ListNode) obj;
        return val == other.val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("" + val);
        ListNode current = next;
        while (current.next != null) {
            result.append(", ");
            result.append(current.val);
            current = current.next;
        }
        result.append(", ");
        result.append(current.val);
        return result.toString();
    }
}
