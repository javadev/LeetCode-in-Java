package g0201_0300.s0207_course_schedule_medium_top_100_liked_questions_top_interview_questions_depth_first_search_breadth_first_search_graph_topological_sort;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            adj[pre[1]].add(pre[0]);
        }
        int[] colors = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (colors[i] == WHITE && !adj[i].isEmpty() && hasCycle(adj, i, colors)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(ArrayList<Integer>[] adj, int node, int[] colors) {
        colors[node] = GRAY;
        for (int nei : adj[node]) {
            if (colors[nei] == GRAY) {
                return true;
            }
            if (colors[nei] == WHITE && hasCycle(adj, nei, colors)) {
                return true;
            }
        }
        colors[node] = BLACK;
        return false;
    }
}
