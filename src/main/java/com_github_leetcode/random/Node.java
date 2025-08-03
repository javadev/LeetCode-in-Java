package com_github_leetcode.random;

@SuppressWarnings("java:S1104")
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append("[");
        result.append(this.val);
        result.append(",");
        if (this.random == null) {
            result.append("null");
        } else {
            result.append(this.random.val);
        }
        result.append("]");
        Node curr = this.next;
        while (curr != null) {
            result.append(",");
            result.append("[");
            result.append(curr.val);
            result.append(",");
            if (curr.random == null) {
                result.append("null");
            } else {
                int randomIndex = 0;
                Node indexFinder = this;
                while (indexFinder.next != null && indexFinder != curr.random) {
                    randomIndex++;
                    indexFinder = indexFinder.next;
                }
                result.append(randomIndex);
            }
            result.append("]");
            curr = curr.next;
        }
        result.append("]");
        return result.toString();
    }
}
