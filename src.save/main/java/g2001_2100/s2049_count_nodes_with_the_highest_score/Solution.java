package g2001_2100.s2049_count_nodes_with_the_highest_score;

// #Medium #Array #Depth_First_Search #Tree #Binary_Tree
// #2022_05_26_Time_40_ms_(93.75%)_Space_92.9_MB_(71.71%)

public class Solution {
    static class Node {
        Node left;
        Node right;
    }

    private int size;
    private long max;
    private int freq = 0;

    private long postOrder(Node root) {
        if (root == null) {
            return 0;
        }
        long left = postOrder(root.left);
        long right = postOrder(root.right);
        long val = Math.max(1, left) * Math.max(1, right) * Math.max(size - left - right - 1, 1);
        if (val > max) {
            max = val;
            freq = 1;
        } else if (val == max) {
            freq += 1;
        }
        return left + right + 1;
    }

    public int countHighestScoreNodes(int[] parents) {
        this.size = parents.length;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node();
        }
        Node root = null;
        for (int i = 0; i < size; i++) {
            if (parents[i] != -1) {
                Node node = nodes[parents[i]];
                if (node.left == null) {
                    node.left = nodes[i];
                } else {
                    node.right = nodes[i];
                }
            } else {
                root = nodes[i];
            }
        }
        postOrder(root);
        return freq;
    }
}
