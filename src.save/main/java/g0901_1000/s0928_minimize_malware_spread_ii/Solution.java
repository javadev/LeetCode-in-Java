package g0901_1000.s0928_minimize_malware_spread_ii;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2022_03_29_Time_41_ms_(31.01%)_Space_87.5_MB_(6.33%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {
    private final Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
    private Set<Integer> visited;
    private int count = 0;

    private void bfs(int ind, int[] initial) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < initial.length; i++) {
            if (i != ind) {
                q.add(initial[i]);
                visited.add(initial[i]);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr != initial[ind]) {
                count++;
            }
            ArrayList<Integer> children = adj.get(curr);
            if (children != null) {
                for (int child : children) {
                    if (!visited.contains(child)) {
                        q.add(child);
                        visited.add(child);
                    }
                }
            }
        }
    }

    public int minMalwareSpread(int[][] graph, int[] initial) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            adj.putIfAbsent(i, new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
        int min = n + 1;
        Arrays.sort(initial);
        int node = initial[0];
        for (int i = 0; i < initial.length; i++) {
            visited = new HashSet<>();
            ArrayList<Integer> children = adj.get(initial[i]);
            adj.remove(initial[i]);
            bfs(i, initial);
            if (count < min) {
                min = count;
                node = initial[i];
            }
            count = 0;
            adj.put(initial[i], children);
        }
        return node;
    }
}
