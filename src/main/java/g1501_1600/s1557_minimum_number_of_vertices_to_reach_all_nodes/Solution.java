package g1501_1600.s1557_minimum_number_of_vertices_to_reach_all_nodes;

// #Medium #Graph #Data_Structure_II_Day_19_Graph #Graph_Theory_I_Day_13_Graph_Theory
// #2022_04_11_Time_8_ms_(99.94%)_Space_78.7_MB_(94.95%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree = new int[n];
        for (List<Integer> edge : edges) {
            indegree[edge.get(1)]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
