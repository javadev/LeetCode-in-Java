package g3901_4000.s3903_smallest_stable_index_i;

// #Easy #Array #Prefix_Sum #Mid_Level #Weekly_Contest_498
// #2026_09_17_Time_1_ms_(99.37%)_Space_46.08_MB_(92.83%)

public class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] mini = new int[n];
        int mint = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < mint) {
                mint = nums[i];
            }
            mini[i] = mint;
        }
        int maxt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxt) {
                maxt = nums[i];
            }
            if (maxt - mini[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
