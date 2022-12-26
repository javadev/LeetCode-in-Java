package g1401_1500.s1449_form_largest_integer_with_digits_that_add_up_to_target;

// #Hard #Array #Dynamic_Programming #2022_03_28_Time_8_ms_(77.46%)_Space_42.2_MB_(81.69%)

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] cost, int target) {
        int[][] dp = new int[10][5001];
        Arrays.fill(dp[0], -1);
        for (int i = 1; i <= cost.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (cost[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int temp =
                            (dp[i - 1][j - cost[i - 1]] == -1)
                                    ? -1
                                    : 1 + dp[i - 1][j - cost[i - 1]];
                    int t = (dp[i][j - cost[i - 1]] == -1) ? -1 : 1 + dp[i][j - cost[i - 1]];
                    if (t != -1 && temp == -1) {
                        temp = t;
                    } else {
                        temp = Math.max(t, temp);
                    }
                    if (dp[i - 1][j] == -1) {
                        dp[i][j] = temp;
                    } else if (temp == -1) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(temp, dp[i - 1][j]);
                    }
                }
            }
        }
        if (dp[9][target] == -1) {
            return "0";
        }
        int i = 9;
        StringBuilder result = new StringBuilder();
        while (target > 0) {
            if ((target - cost[i - 1] >= 0 && dp[i][target - cost[i - 1]] + 1 == dp[i][target])
                    || (target - cost[i - 1] >= 0
                            && dp[i - 1][target - cost[i - 1]] + 1 == dp[i][target])) {
                result.append(i);
                target -= cost[i - 1];
            } else {
                i--;
            }
        }
        return result.toString();
    }
}
