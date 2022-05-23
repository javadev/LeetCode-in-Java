package g2001_2100.s2090_k_radius_subarray_averages;

// #Array #Sliding Window
// #2022_05_20_Time_12ms_(83.19%)_Space_59.9_MB_(93.58%)
import java.util.Arrays;

public class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k >= nums.length) {
            int[] ans = new int[nums.length];
            Arrays.fill(ans, -1);
            return ans;
        }
        long[] prefix = new long[nums.length];
        int[] ans = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) prefix[i] = nums[i] + prefix[i - 1];
        for (int i = 0; i < k; i++) ans[i] = -1;
        int n = 2 * k + 1;
        for (int i = k; i < nums.length - k; i++) {
            long left_sum = prefix[i] - nums[i] - prefix[i - k] + nums[i - k];
            long right_sum = prefix[i + k] - prefix[i];
            ans[i] = (int) ((right_sum + left_sum + nums[i]) / n);
        }
        for (int i = nums.length - k; i < nums.length; i++) ans[i] = -1;
        return ans;
    }
}
