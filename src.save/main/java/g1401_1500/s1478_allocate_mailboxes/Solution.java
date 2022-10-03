package g1401_1500.s1478_allocate_mailboxes;

// #Hard #Array #Dynamic_Programming #Math #Sorting
// #2022_04_04_Time_12_ms_(78.87%)_Space_41.6_MB_(89.79%)

import java.util.Arrays;

public class Solution {
    public int minDistance(int[] houses, int k) {
        Arrays.sort(houses);
        int n = houses.length;
        int[][] dp = new int[n][k + 1];
        for (int[] ar : dp) {
            Arrays.fill(ar, -1);
        }
        return recur(houses, 0, k, dp);
    }

    private int recur(int[] houses, int idx, int k, int[][] dp) {
        if (dp[idx][k] != -1) {
            return dp[idx][k];
        }
        if (k == 1) {
            int dist = calDist(houses, idx, houses.length - 1);
            dp[idx][k] = dist;
            return dp[idx][k];
        }
        int min = Integer.MAX_VALUE;
        for (int i = idx; i + k - 1 < houses.length; i++) {
            int dist = calDist(houses, idx, i);
            dist += recur(houses, i + 1, k - 1, dp);
            min = Math.min(min, dist);
        }
        dp[idx][k] = min;
        return min;
    }

    private int calDist(int[] ar, int start, int end) {
        int result = 0;
        while (start < end) {
            result += ar[end--] - ar[start++];
        }
        return result;
    }
}
