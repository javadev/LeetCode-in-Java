package com_github_leetcode;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < neighbors.size(); i++) {
            Node node = neighbors.get(i);
            if (i > 0) {
                result.append(",");
            }
            if (node.neighbors.isEmpty()) {
                result.append(node.val);
            } else {
                StringBuilder result2 = new StringBuilder();
                result2.append("[");
                for (int j = 0; j < node.neighbors.size(); j++) {
                    Node nodeItem = node.neighbors.get(j);
                    if (j > 0) {
                        result2.append(",");
                    }
                    result2.append(nodeItem.val);
                }
                result2.append("]");
                result.append(result2.toString());
            }
        }
        result.append("]");
        return result.toString();
    }
}
