package g3101_3200.s3176_find_the_maximum_length_of_a_good_subsequence_i;

// #Medium #Array #Hash_Table #Dynamic_Programming
// #2024_06_12_Time_4_ms_(99.70%)_Space_44_MB_(87.51%)

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        if (count <= k) {
            return n;
        }
        int[] max = new int[k + 1];
        Arrays.fill(max, 1);
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i + 1);
            } else {
                vis[i] = map.get(nums[i]) - 1;
                map.put(nums[i], i + 1);
            }
        }
        int[][] dp = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = k - 1; j >= 0; j--) {
                dp[i][j + 1] = Math.max(dp[i][j + 1], 1 + max[j]);
                max[j + 1] = Math.max(max[j + 1], dp[i][j + 1]);
            }
            if (vis[i] != -1) {
                int a = vis[i];
                for (int j = 0; j <= k; j++) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[a][j]);
                    max[j] = Math.max(dp[i][j], max[j]);
                }
            }
        }
        int ans = 1;
        for (int i = 0; i <= k; i++) {
            ans = Math.max(ans, max[i]);
        }
        return ans;
    }
}
