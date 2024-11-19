package g3301_3400.s3356_zero_array_transformation_ii;

// #Medium #Array #Binary_Search #Prefix_Sum #2024_11_19_Time_4_ms_(93.46%)_Space_118.5_MB_(13.87%)

public class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length];
        int idx = 0;
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            d += diff[i];
            while (nums[i] + d > 0 && idx < queries.length) {
                int[] q = queries[idx];
                if (i >= q[0] && i <= q[1]) {
                    d -= q[2];
                }
                diff[q[0]] -= q[2];
                if (q[1] + 1 < nums.length) {
                    diff[q[1] + 1] += q[2];
                }
                idx++;
            }
            if (nums[i] + d > 0) {
                return -1;
            }
        }
        return idx;
    }
}
