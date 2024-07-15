package g3201_3300.s3213_construct_string_with_minimum_cost;

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_15_Time_261_ms_(88.55%)_Space_67.2_MB_(45.91%)

import java.util.Arrays;

public class Solution {
    private static class ACAutomaton {
        private static class Node {
            private char key;
            private Integer val = null;
            private int len;
            private final Node[] next = new Node[26];
            private Node suffix = null;
            private Node output = null;
            private Node parent = null;
        }

        public Node build(String[] patterns, int[] values) {
            Node root = new Node();
            root.suffix = root;
            root.output = root;
            for (int i = 0; i < patterns.length; i++) {
                put(root, patterns[i], values[i]);
            }
            for (int i = 0; i < root.next.length; i++) {
                if (root.next[i] == null) {
                    root.next[i] = root;
                } else {
                    root.next[i].suffix = root;
                }
            }
            return root;
        }

        private void put(Node root, String s, int val) {
            Node node = root;
            for (char c : s.toCharArray()) {
                if (node.next[c - 'a'] == null) {
                    node.next[c - 'a'] = new Node();
                    node.next[c - 'a'].parent = node;
                    node.next[c - 'a'].key = c;
                }
                node = node.next[c - 'a'];
            }
            if (node.val == null || node.val > val) {
                node.val = val;
                node.len = s.length();
            }
        }

        public Node getOutput(Node node) {
            if (node.output == null) {
                Node suffix = getSuffix(node);
                node.output = suffix.val != null ? suffix : getOutput(suffix);
            }
            return node.output;
        }

        private Node go(Node node, char c) {
            if (node.next[c - 'a'] == null) {
                node.next[c - 'a'] = go(getSuffix(node), c);
            }
            return node.next[c - 'a'];
        }

        private Node getSuffix(Node node) {
            if (node.suffix == null) {
                node.suffix = go(getSuffix(node.parent), node.key);
                if (node.suffix.val != null) {
                    node.output = node.suffix;
                } else {
                    node.output = node.suffix.output;
                }
            }
            return node.suffix;
        }
    }

    public int minimumCost(String target, String[] words, int[] costs) {
        ACAutomaton ac = new ACAutomaton();
        ACAutomaton.Node root = ac.build(words, costs);
        int[] dp = new int[target.length() + 1];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;
        ACAutomaton.Node node = root;
        for (int i = 1; i < dp.length; i++) {
            node = ac.go(node, target.charAt(i - 1));
            for (ACAutomaton.Node temp = node;
                    temp != null && temp != root;
                    temp = ac.getOutput(temp)) {
                if (temp.val != null && dp[i - temp.len] < Integer.MAX_VALUE / 2) {
                    dp[i] = Math.min(dp[i], dp[i - temp.len] + temp.val);
                }
            }
        }
        return dp[dp.length - 1] >= Integer.MAX_VALUE / 2 ? -1 : dp[dp.length - 1];
    }
}
