package g0201_0300.s0210_course_schedule_ii;

// #Medium #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search #Graph
// #Topological_Sort #Level_2_Day_11_Graph/BFS/DFS
// #2022_06_28_Time_13_ms_(35.17%)_Space_50.7_MB_(22.84%)

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
