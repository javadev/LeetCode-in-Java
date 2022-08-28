package g2101_2200.s2101_detonate_the_maximum_bombs;

// #Medium #Array #Math #Depth_First_Search #Breadth_First_Search #Graph #Geometry
// #2022_05_31_Time_27_ms_(94.17%)_Space_49.6_MB_(48.45%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dx = bombs[i][0] - (double) bombs[j][0];
                double dy = bombs[i][1] - (double) bombs[j][1];
                double r1 = bombs[i][2];
                double r2 = bombs[j][2];
                double dist = dx * dx + dy * dy;
                if (dist <= r1 * r1) {
                    graph[i].add(j);
                }
                if (dist <= r2 * r2) {
                    graph[j].add(i);
                }
            }
        }
        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(graph, i, visited));
            if (ans == n) {
                return ans;
            }
            Arrays.fill(visited, false);
        }
        return ans;
    }

    private int dfs(List<Integer>[] graph, int i, boolean[] visited) {
        int cc = 0;
        if (visited[i]) {
            return 0;
        }
        visited[i] = true;
        for (int neigh : graph[i]) {
            cc += dfs(graph, neigh, visited);
        }
        return cc + 1;
    }
}
