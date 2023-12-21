package g2001_2100.s2050_parallel_courses_iii;

// #Hard #Dynamic_Programming #Graph #Topological_Sort
// #2022_05_26_Time_33_ms_(86.04%)_Space_127.1_MB_(28.87%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        int v = time.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[v];
        int[] requiredTime = new int[v];
        for (int[] relation : relations) {
            List<Integer> vertices = adj.get(relation[0] - 1);
            vertices.add(relation[1] - 1);
            indegree[relation[1] - 1]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
                requiredTime[i] = time[i];
            }
        }

        while (!q.isEmpty()) {
            int vertex = q.poll();
            List<Integer> edges = adj.get(vertex);
            for (Integer e : edges) {
                indegree[e]--;
                if (indegree[e] == 0) {
                    q.add(e);
                }
                int totalTime = time[e] + requiredTime[vertex];
                if (requiredTime[e] < totalTime) {
                    requiredTime[e] = totalTime;
                }
            }
        }
        int maxMonth = 0;
        for (int i = 0; i < n; i++) {
            maxMonth = Math.max(maxMonth, requiredTime[i]);
        }
        return maxMonth;
    }
}
