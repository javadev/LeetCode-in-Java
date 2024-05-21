package g3101_3200.s3152_special_array_ii;

// #Medium #Array #Binary_Search #Prefix_Sum #2024_05_22_Time_2_ms_(99.93%)_Space_97.9_MB_(79.71%)

public class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] bad = new int[n];
        for (int i = 1; i < n; i++) {
            bad[i] = bad[i - 1] + (((nums[i - 1] ^ nums[i]) & 1) ^ 1);
        }
        int nq = queries.length;
        boolean[] res = new boolean[nq];
        for (int i = 0; i < nq; i++) {
            int[] q = queries[i];
            res[i] = calc(bad, q[0], q[1]) == 0;
        }
        return res;
    }

    private int calc(int[] arr, int st, int end) {
        return arr[end] - arr[st];
    }
}
