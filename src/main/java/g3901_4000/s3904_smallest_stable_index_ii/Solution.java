package g3901_4000.s3904_smallest_stable_index_ii;

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_498
// #2026_09_17_Time_3_ms_(92.71%)_Space_133.24_MB_(29.87%)

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
