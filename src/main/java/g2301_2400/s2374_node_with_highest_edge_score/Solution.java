package g2301_2400.s2374_node_with_highest_edge_score;

// #Medium #Hash_Table #Graph #2022_08_19_Time_4_ms_(97.68%)_Space_85.4_MB_(85.92%)

public class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        int[] score = new int[n];
        int maxScore = 0;
        int node = 0;
        for (int i = 0; i < n; i++) {
            score[edges[i]] += i;
            if (score[edges[i]] >= maxScore) {
                if (score[edges[i]] == maxScore) {
                    node = Math.min(node, edges[i]);
                } else {
                    node = edges[i];
                }
                maxScore = score[edges[i]];
            }
        }
        return node;
    }
}
