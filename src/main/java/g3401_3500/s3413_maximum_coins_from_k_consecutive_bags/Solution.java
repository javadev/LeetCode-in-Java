package g3401_3500.s3413_maximum_coins_from_k_consecutive_bags;

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum #Sliding_Window
// #2025_01_07_Time_82_(92.23%)_Space_134.12_(21.36%)

import java.util.Arrays;

public class Solution {
    public long maximumCoins(int[][] coins, int k) {
        Arrays.sort(coins, (a, b) -> a[0] - b[0]);
        int n = coins.length;
        long res = 0;
        long cur = 0;
        for (int i = 0, j = 0; i < n; ++i) {
            while (j < n && coins[j][1] <= coins[i][0] + k - 1) {
                cur += (long) (coins[j][1] - coins[j][0] + 1) * coins[j][2];
                j++;
            }
            if (j < n) {
                long part = (long) Math.max(0, coins[i][0] + k - 1 - coins[j][0] + 1) * coins[j][2];
                res = Math.max(res, cur + part);
            }
            cur -= (long) (coins[i][1] - coins[i][0] + 1) * coins[i][2];
        }
        cur = 0;
        for (int i = 0, j = 0; i < n; ++i) {
            cur += (long) (coins[i][1] - coins[i][0] + 1) * coins[i][2];
            while (coins[j][1] < coins[i][1] - k + 1) {
                cur -= (long) (coins[j][1] - coins[j][0] + 1) * coins[j][2];
                j++;
            }
            long part = (long) Math.max(0, coins[i][1] - k - coins[j][0] + 1) * coins[j][2];
            res = Math.max(res, cur - part);
        }
        return res;
    }
}
