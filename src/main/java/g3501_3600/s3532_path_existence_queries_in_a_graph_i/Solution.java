package g3501_3600.s3532_path_existence_queries_in_a_graph_i;

// #Medium #Array #Binary_Search #Graph #Union_Find
// #2025_04_28_Time_3_ms_(100.00%)_Space_77.82_MB_(100.00%)

public class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] comp = new int[n];
        int compId = 0;
        comp[0] = compId;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                comp[i] = compId;
            } else {
                compId++;
                comp[i] = compId;
            }
        }
        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            ans[i] = (comp[x] == comp[y]);
        }
        return ans;
    }
}
