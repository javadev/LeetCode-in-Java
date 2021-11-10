package com_github_leetcode.random;

import java.util.StringJoiner;

@SuppressWarnings("java:S1104")
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
        this.val = 0;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    public String toString() {
        StringJoiner result = new StringJoiner(",", "[", "]");
        StringJoiner result2 = new StringJoiner(",", "[", "]");
        result2.add(String.valueOf(val));
        if (random == null) {
            result2.add("null");
        } else {
            result2.add(String.valueOf(random.val));
        }
        result.add(result2.toString());
        Node curr = next;
        while (curr != null) {
            StringJoiner result3 = new StringJoiner(",", "[", "]");
            result3.add(String.valueOf(curr.val));
            if (curr.random == null) {
                result3.add("null");
            } else {
                int randomIndex = 0;
                Node curr2 = this;
                while (curr2.next != null && curr2 != curr.random) {
                    randomIndex += 1;
                    curr2 = curr2.next;
                }
                result3.add(String.valueOf(randomIndex));
            }
            result.add(result3.toString());
            curr = curr.next;
        }
        return result.toString();
    }
}
