package g3101_3200.s3108_minimum_cost_walk_in_weighted_graph;

// #Hard #Array #Bit_Manipulation #Graph #Union_Find
// #2024_04_11_Time_3_ms_(100.00%)_Space_118.6_MB_(21.36%)

public class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int i;
        int[] parent = new int[n];
        int[] bitwise = new int[n];
        int[] size = new int[n];
        for (i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
            bitwise[i] = -1;
        }
        int len = edges.length;
        for (i = 0; i < len; i++) {
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            int weight = edges[i][2];
            int parent1 = findParent(node1, parent);
            int parent2 = findParent(node2, parent);
            if (parent1 == parent2) {
                bitwise[parent1] &= weight;
            } else {
                int bitwiseVal = 0;
                boolean check1 = bitwise[parent1] == -1;
                boolean check2 = bitwise[parent2] == -1;
                if (check1 && check2) {
                    bitwiseVal = weight;
                } else if (check1) {
                    bitwiseVal = weight & bitwise[parent2];
                } else if (check2) {
                    bitwiseVal = weight & bitwise[parent1];
                } else {
                    bitwiseVal = weight & bitwise[parent1] & bitwise[parent2];
                }
                if (size[parent1] >= size[parent2]) {
                    parent[parent2] = parent1;
                    size[parent1] += size[parent2];
                    bitwise[parent1] = bitwiseVal;
                } else {
                    parent[parent1] = parent2;
                    size[parent2] += size[parent1];
                    bitwise[parent2] = bitwiseVal;
                }
            }
        }
        int queryLen = query.length;
        int[] result = new int[queryLen];
        for (i = 0; i < queryLen; i++) {
            int start = query[i][0];
            int end = query[i][1];
            int parentStart = findParent(start, parent);
            int parentEnd = findParent(end, parent);
            if (start == end) {
                result[i] = 0;
            } else if (parentStart == parentEnd) {
                result[i] = bitwise[parentStart];
            } else {
                result[i] = -1;
            }
        }
        return result;
    }

    private int findParent(int node, int[] parent) {
        while (parent[node] != node) {
            node = parent[node];
        }
        return node;
    }
}
