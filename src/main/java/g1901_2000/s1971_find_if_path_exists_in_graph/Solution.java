package g1901_2000.s1971_find_if_path_exists_in_graph;

// #Easy #Depth_First_Search #Breadth_First_Search #Graph
// #2022_05_21_Time_4_ms_(99.57%)_Space_137.2_MB_(81.65%)

public class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        visited[start] = true;
        boolean newVisit = true;
        while (!visited[end] && newVisit) {
            newVisit = false;
            for (int i = edges.length - 1; i >= 0; i--) {
                if (visited[edges[i][0]]) {
                    if (!visited[edges[i][1]]) {
                        visited[edges[i][1]] = newVisit = true;
                    }
                } else if (visited[edges[i][1]]) {
                    visited[edges[i][0]] = newVisit = true;
                }
            }
        }

        return visited[end];
    }
}
