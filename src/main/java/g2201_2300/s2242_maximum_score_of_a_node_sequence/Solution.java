package g2201_2300.s2242_maximum_score_of_a_node_sequence;

// #Hard #Array #Sorting #Graph #Enumeration #2022_06_11_Time_28_ms_(97.57%)_Space_133.9_MB_(11.84%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    public int maximumScore(int[] scores, int[][] edges) {
        // store only top 3 nodes (having highest scores)
        int[][] graph = new int[scores.length][3];
        for (int[] a : graph) {
            Arrays.fill(a, -1);
        }
        for (int[] edge : edges) {
            insert(edge[0], graph[edge[1]], scores);
            insert(edge[1], graph[edge[0]], scores);
        }
        int maxScore = -1;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int score = scores[u] + scores[v];
            for (int i = 0; i < 3; i++) {
                // if neighbour is current node, skip
                if (graph[u][i] == -1 || graph[u][i] == v) {
                    continue;
                }
                for (int j = 0; j < 3; j++) {
                    // if neighbour is current node or already choosen node, skip
                    if (graph[v][j] == -1 || graph[v][j] == u) {
                        continue;
                    }
                    if (graph[v][j] == graph[u][i]) {
                        continue;
                    }
                    maxScore =
                            Math.max(maxScore, score + scores[graph[u][i]] + scores[graph[v][j]]);
                }
            }
        }
        return maxScore;
    }

    private void insert(int n, int[] arr, int[] scores) {
        if (arr[0] == -1) {
            arr[0] = n;
        } else if (arr[1] == -1) {
            if (scores[arr[0]] < scores[n]) {
                arr[1] = arr[0];
                arr[0] = n;
            } else {
                arr[1] = n;
            }
        } else if (arr[2] == -1) {
            if (scores[arr[0]] < scores[n]) {
                arr[2] = arr[1];
                arr[1] = arr[0];
                arr[0] = n;
            } else if (scores[arr[1]] < scores[n]) {
                arr[2] = arr[1];
                arr[1] = n;
            } else {
                arr[2] = n;
            }
        } else {
            if (scores[arr[1]] < scores[n]) {
                arr[2] = arr[1];
                arr[1] = n;
            } else if (scores[arr[2]] < scores[n]) {
                arr[2] = n;
            }
        }
    }
}
