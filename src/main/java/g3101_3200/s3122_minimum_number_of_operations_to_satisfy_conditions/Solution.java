package g3101_3200.s3122_minimum_number_of_operations_to_satisfy_conditions;

// #Medium #Array #Dynamic_Programming #Matrix
// #2024_04_27_Time_6_ms_(100.00%)_Space_156.6_MB_(54.30%)

public class Solution {
    public int minimumOperations(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[m][10];
        int[][] cnt = new int[m][10];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; j++) {
                cnt[j][grid[i][j]]++;
            }
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int firstId = -1;
        int secondId = -1;
        for (int i = 0; i < 10; i++) {
            dp[0][i] = n - cnt[0][i];
            if (dp[0][i] <= first) {
                second = first;
                first = dp[0][i];
                secondId = firstId;
                firstId = i;
            } else if (dp[0][i] < second) {
                second = dp[0][i];
                secondId = i;
            }
        }
        for (int j = 1; j < m; ++j) {
            int lastFirstId = firstId;
            int lastSecondId = secondId;
            first = second = Integer.MAX_VALUE;
            firstId = secondId = -1;
            for (int i = 0; i < 10; ++i) {
                int tmp;
                int fix = n - cnt[j][i];
                if (i == lastFirstId) {
                    tmp = fix + dp[j - 1][lastSecondId];
                } else {
                    tmp = fix + dp[j - 1][lastFirstId];
                }
                if (tmp <= first) {
                    second = first;
                    first = tmp;
                    secondId = firstId;
                    firstId = i;
                } else if (tmp < second) {
                    second = tmp;
                    secondId = i;
                }
                dp[j][i] = tmp;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 10; ++i) {
            ans = Math.min(ans, dp[m - 1][i]);
        }
        return ans;
    }
}
