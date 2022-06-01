package g1701_1800.s1791_find_center_of_star_graph;

// #Easy #Graph #2022_05_03_Time_0_ms_(100.00%)_Space_71_MB_(77.85%)

public class Solution {
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }
        return edges[0][1];
    }
}
