package g0201_0300.s0210_course_schedule_ii_medium_top_interview_questions_depth_first_search_breadth_first_search_graph_topological_sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] classes : prerequisites) {
            graph.get(classes[0]).add(classes[1]);
        }

        List<Integer> output = new ArrayList<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        for (int c : graph.keySet()) {
            if (dfs(c, graph, visited, output)) {
                return new int[0];
            }
        }

        int[] res = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            res[i] = output.get(i);
        }
        return res;
    }

    private boolean dfs(
            int course,
            Map<Integer, List<Integer>> graph,
            Map<Integer, Boolean> visited,
            List<Integer> output) {
        if (visited.containsKey(course)) {
            return visited.get(course);
        }

        visited.put(course, true);

        for (int c : graph.get(course)) {
            if (dfs(c, graph, visited, output)) {
                return true;
            }
        }

        visited.put(course, false);
        output.add(course);
        return false;
    }
}
