package g2101_2200.s2192_all_ancestors_of_a_node_in_a_directed_acyclic_graph;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #2022_06_07_Time_82_ms_(90.80%)_Space_137.8_MB_(29.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> adjList;
    private List<List<Integer>> result;

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        this.adjList = new ArrayList<>();
        this.result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
            result.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            adjList.get(start).add(end);
        }
        //  DFS for each node from 0 --> n , and add that node as root/parent into each reachable
        // node and their child
        //  Use visited[] to identify if any of the child or their childs are already visited for
        // that perticular root/parent,
        //  so will not add the root to avoid duplicacy and call reduction .
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            List<Integer> childList = adjList.get(i);
            for (Integer child : childList) {
                if (!visited[child]) {
                    dfs(i, child, visited);
                }
            }
        }
        return result;
    }

    private void dfs(int root, int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        result.get(node).add(root);
        List<Integer> childList = adjList.get(node);
        for (Integer child : childList) {
            if (!visited[child]) {
                dfs(root, child, visited);
            }
        }
    }
}
