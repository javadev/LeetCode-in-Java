package g3301_3400.s3372_maximize_the_number_of_target_nodes_after_connecting_trees_i;

// #Medium #2024_12_01_Time_828_ms_(100.00%)_Space_47.8_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private void bfs(ArrayList<ArrayList<Integer>> tree, int node, int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(node);
        int count = 0;
        while (!q.isEmpty() && count <= k) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int temp = q.poll();
                visited.add(temp);
                for (int x : tree.get(temp)) {
                    if (!visited.contains(x)) {
                        q.offer(x);
                    }
                }
            }
            count++;
        }
        arr[node] = visited.size();
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        ArrayList<ArrayList<Integer>> tree1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> tree2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree1.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            tree2.add(new ArrayList<>());
        }
        for (int[] e : edges1) {
            tree1.get(e[0]).add(e[1]);
            tree1.get(e[1]).add(e[0]);
        }
        for (int[] e : edges2) {
            tree2.get(e[0]).add(e[1]);
            tree2.get(e[1]).add(e[0]);
        }
        int[] tar1 = new int[n];
        int[] tar2 = new int[m];
        for (int i = 0; i < m; i++) {
            bfs(tree2, i, tar2, k - 1);
        }
        int max = 0;
        for (int i : tar2) {
            max = Math.max(i, max);
        }
        for (int i = 0; i < n; i++) {
            bfs(tree1, i, tar1, k);
        }
        for (int i = 0; i < n; i++) {
            tar1[i] += max;
        }
        return tar1;
    }
}
