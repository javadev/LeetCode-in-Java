package g1001_1100.s1042_flower_planting_with_no_adjacent;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #2022_02_27_Time_19_ms_(89.02%)_Space_72.1_MB_(61.13%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private List<Integer>[] graph;
    private int[] color;
    private boolean[] visited;

    public int[] gardenNoAdj(int n, int[][] paths) {
        buildGraph(n, paths);
        this.color = new int[n];
        this.visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        return color;
    }

    private void dfs(int at) {
        visited[at] = true;
        int used = 0;

        for (int to : graph[at]) {
            if (color[to] != 0) {
                used |= 1 << color[to] - 1;
            }
        }

        // use available color
        for (int i = 0; i < 4; i++) {
            if ((used & 1 << i) == 0) {
                color[at] = i + 1;
                break;
            }
        }
    }

    private void buildGraph(int n, int[][] paths) {
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] path : paths) {
            int u = path[0] - 1;
            int v = path[1] - 1;
            graph[u].add(v);
            graph[v].add(u);
        }
    }
}
