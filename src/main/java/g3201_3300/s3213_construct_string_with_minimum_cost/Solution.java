package g3201_3300.s3213_construct_string_with_minimum_cost;

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_13_Time_1907_ms_(5.01%)_Space_100.9_MB_(5.09%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    List<Integer> buildKmpPrefix(String target) {
        List<Integer> w = new ArrayList<>(Collections.nCopies(target.length(), 0));
        int k = 0;
        int i = 1;
        while (i < target.length()) {
            if (target.charAt(i) == target.charAt(k)) {
                k++;
                w.set(i, k);
                i++;
            } else {
                if (k != 0) {
                    k = w.get(k - 1);
                } else {
                    i++;
                }
            }
        }
        return w;
    }

    List<List<Integer>> find(List<Integer> prefix, String target, String w) {
        List<List<Integer>> result = new ArrayList<>();
        int m = target.length();
        int n = w.length();
        int i = 0;
        int k = 0;
        while (i < m) {
            if (target.charAt(i) == w.charAt(k)) {
                i++;
                k++;
            }
            if (k == n) {
                result.add(Arrays.asList(i - k, i));
                k = prefix.get(k - 1);
            } else if (i < m && target.charAt(i) != w.charAt(k)) {
                if (k != 0) {
                    k = prefix.get(k - 1);
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public int minimumCost(String target, String[] words, int[] costs) {
        List<Integer> targetPrefix = buildKmpPrefix(target);
        Node root = new Node();
        for (int j = 0; j < words.length; j++) {
            String x = words[j];
            if (x.length() < 320) {
                Node p = root;
                for (int i = 0; i < x.length(); i++) {
                    char c = x.charAt(i);
                    p.children.putIfAbsent(c, new Node());
                    p = p.children.get(c);
                    if (i == x.length() - 1) {
                        if (p.cost == null) {
                            p.cost = costs[j];
                        } else {
                            p.cost = Math.min(costs[j], p.cost);
                        }
                    }
                }
            }
        }
        Map<Integer, Map<Integer, Integer>> dm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= 320) {
                List<List<Integer>> q = find(targetPrefix, target, word);
                for (List<Integer> pair : q) {
                    int b = pair.get(0);
                    int e = pair.get(1);
                    dm.putIfAbsent(e, new HashMap<>());
                    Map<Integer, Integer> qm = dm.get(e);
                    int value = qm.getOrDefault(b, Integer.MAX_VALUE));
                    qm.put(b, Math.min(value, costs[i]));
                }
            }
        }
        List<NodeCostPair> d = new ArrayList<>();
        d.add(new NodeCostPair(root, 0));
        int[] dp = new int[target.length() + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < target.length(); i++) {
            char x = target.charAt(i);
            List<NodeCostPair> q = new ArrayList<>();
            Integer t = null;
            for (NodeCostPair pair : d) {
                Node p = pair.node;
                int cost = pair.cost;
                if (p.children.containsKey(x)) {
                    Node w = p.children.get(x);
                    if (w.cost != null) {
                        t = t == null ? cost + w.cost : Math.min(t, cost + w.cost);
                    }
                    q.add(new NodeCostPair(w, cost));
                }
            }
            Map<Integer, Integer> qm = dm.getOrDefault(i + 1, Collections.emptyMap());
            for (Map.Entry<Integer, Integer> entry : qm.entrySet()) {
                int b = entry.getKey();
                if (dp[b] >= 0) {
                    t =
                            t == null
                                    ? dp[b] + entry.getValue()
                                    : Math.min(t, dp[b] + entry.getValue());
                }
            }
            if (t != null) {
                dp[i + 1] = t;
                q.add(new NodeCostPair(root, t));
            }
            d = q;
        }
        return dp[target.length()];
    }

    private static class Node {
        Map<Character, Node> children;
        Integer cost;

        public Node() {
            this.children = new HashMap<>();
            this.cost = null;
        }
    }

    private static class NodeCostPair {
        Node node;
        int cost;

        public NodeCostPair(Node node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}
