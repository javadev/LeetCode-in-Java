package com_github_leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@SuppressWarnings("java:S1104")
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    public String toString() {
        StringJoiner result = new StringJoiner(",", "[", "]");
        for (Node node : neighbors) {
            if (node.neighbors.isEmpty()) {
                result.add(String.valueOf(node.val));
            } else {
                StringJoiner result2 = new StringJoiner(",", "[", "]");
                for (Node nodeItem : node.neighbors) {
                    result2.add(String.valueOf(nodeItem.val));
                }
                result.add(result2.toString());
            }
        }
        return result.toString();
    }
}
