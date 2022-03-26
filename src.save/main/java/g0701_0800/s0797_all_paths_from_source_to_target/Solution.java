package g0701_0800.s0797_all_paths_from_source_to_target;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Backtracking
// #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_7_Standard_Traversal #2022_03_26_Time_2_ms_(90.53%)_Space_55.3_MB_(32.03%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        // perform DFS
        solve(graph, temp, 0);
        return res;
    }

    private void solve(int[][] graph, List<Integer> temp, int lastNode) {
        if (lastNode == graph.length - 1) {
            res.add(new ArrayList<>(temp));
        }
        for (int link : graph[lastNode]) {
            temp.add(link);
            solve(graph, temp, link);
            temp.remove(temp.size() - 1);
        }
    }
}
