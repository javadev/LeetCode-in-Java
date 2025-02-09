package g3401_3500.s3413_maximum_coins_from_k_consecutive_bags;

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum #Sliding_Window
// #2025_01_07_Time_82_ms_(92.23%)_Space_134.12_MB_(21.36%)

import java.util.Arrays;

public class Solution {
    public long maximumCoins(int[][] coins, int k) {
        Arrays.sort(coins, (a, b) -> a[0] - b[0]);
        int n = coins.length;
        long res = 0;
        long cur = 0;
        int j = 0;
        for (int[] ints : coins) {
            while (j < n && coins[j][1] <= ints[0] + k - 1) {
                cur += (long) (coins[j][1] - coins[j][0] + 1) * coins[j][2];
                j++;
            }
            if (j < n) {
                long part = (long) Math.max(0, ints[0] + k - 1 - coins[j][0] + 1) * coins[j][2];
                res = Math.max(res, cur + part);
            }
            cur -= (long) (ints[1] - ints[0] + 1) * ints[2];
        }
        cur = 0;
        j = 0;
        for (int[] coin : coins) {
            cur += (long) (coin[1] - coin[0] + 1) * coin[2];
            while (coins[j][1] < coin[1] - k + 1) {
                cur -= (long) (coins[j][1] - coins[j][0] + 1) * coins[j][2];
                j++;
            }
            long part = (long) Math.max(0, coin[1] - k - coins[j][0] + 1) * coins[j][2];
            res = Math.max(res, cur - part);
        }
        return res;
    }
}
