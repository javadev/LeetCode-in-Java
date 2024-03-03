package g3001_3100.s3041_maximize_consecutive_elements_in_an_array_after_modification;

// #Hard #Array #Dynamic_Programming #Sorting
// #2024_03_03_Time_13_ms_(100.00%)_Space_61.4_MB_(59.30%)

public class Solution {
    public int maxSelectedElements(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            max = Math.max(x, max);
            min = Math.min(x, min);
        }
        int[] count = new int[max + 1];
        for (int x : nums) {
            ++count[x];
        }
        int[] dp = new int[max + 2];
        int ans = 0;
        for (int x = min; x <= max; ++x) {
            if (count[x] == 0) {
                continue;
            }
            int c = count[x];
            if (c == 1) {
                dp[x + 1] = dp[x] + 1;
                dp[x] = dp[x - 1] + 1;
            } else {
                dp[x] = dp[x - 1] + 1;
                dp[x + 1] = dp[x] + 1;
            }
            ans = Math.max(ans, dp[x]);
            ans = Math.max(ans, dp[x + 1]);
        }
        return ans;
    }
}
