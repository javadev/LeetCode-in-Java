package g0301_0400.s0310_minimum_height_trees;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort #Acceptance_38.1%
// #2022_03_14_Time_22_ms_(94.43%)_Space_75.7_MB_(51.83%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> answer = new ArrayList<>();
        if (n == 1) {
            answer.add(0);
            return answer;
        }
        List<Integer>[] graph = new ArrayList[n];
        int[] degree = new int[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        Queue<Integer> leaf = new LinkedList<>();
        int remainingNodes = n;
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                leaf.add(i);
            }
        }
        while (!leaf.isEmpty()) {
            // We found answer if queue left with <=2 elements
            if (remainingNodes <= 2) {
                break;
            }
            int size = leaf.size();
            while (--size >= 0) {
                int l = leaf.poll();
                remainingNodes--;
                for (int adj : graph[l]) {
                    // edge is removed so degree will decrease for both vertex
                    degree[adj]--;
                    if (degree[adj] == 1) {
                        leaf.add(adj);
                    }
                }
            }
        }
        answer.addAll(leaf);
        return answer;
    }
}
