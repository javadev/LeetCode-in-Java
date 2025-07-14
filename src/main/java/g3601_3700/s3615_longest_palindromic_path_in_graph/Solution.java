package g3601_3700.s3615_longest_palindromic_path_in_graph;

// #Hard #String #Dynamic_Programming #Bit_Manipulation #Graph
// #2025_07_14_Time_641_ms_(100.00%)_Space_88.48_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public int maxLen(int n, int[][] edges, String labelsStr) {
        char[] labels = labelsStr.toCharArray();
        // collect lists of adjacent nodes
        int[][] adj = adj(n, edges);
        // size of int to store n bits bitmask
        int bSize = 1 << n;
        int[][][] cache = new int[n][n][bSize];
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            // find palindromes of odd length (one node in the middle)
            int localLength = findPalindrome(adj, labels, i, i, 0, cache);
            maxLength = Math.max(maxLength, localLength);
            // find palindromes of even length (two nodes in the middle)
            for (int j : adj[i]) {
                if (labels[i] == labels[j]) {
                    int length = findPalindrome(adj, labels, i, j, 0, cache);
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }

    private int findPalindrome(int[][] adj, char[] labels, int i, int j, int b, int[][][] cache) {
        if (cache[i][j][b] != 0) {
            return cache[i][j][b];
        }
        int b1 = set(b, i);
        b1 = set(b1, j);
        int length = i == j ? 1 : 2;
        int maxExtraLength = 0;
        for (int i1 : adj[i]) {
            if (get(b1, i1)) {
                continue;
            }
            for (int j1 : adj[j]) {
                if (i1 == j1) {
                    continue;
                }
                if (labels[i1] != labels[j1]) {
                    continue;
                }
                if (get(b1, j1)) {
                    continue;
                }
                int extraLength = findPalindrome(adj, labels, i1, j1, b1, cache);
                maxExtraLength = Math.max(maxExtraLength, extraLength);
            }
        }
        cache[i][j][b] = length + maxExtraLength;
        return length + maxExtraLength;
    }

    private boolean get(int b, int i) {
        return (b & (1 << i)) != 0;
    }

    private int set(int b, int i) {
        return b | (1 << i);
    }

    private int[][] adj(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int[][] adj = new int[n][];
        for (int i = 0; i < n; i++) {
            adj[i] = adjList.get(i).stream().mapToInt(j -> j).toArray();
        }
        return adj;
    }
}
