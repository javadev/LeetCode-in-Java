package g1101_1200.s1105_filling_bookcase_shelves;

// #Medium #Array #Dynamic_Programming #2023_06_01_Time_3_ms_(21.25%)_Space_41.2_MB_(94.90%)

import java.util.Arrays;

public class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int widthLeft = shelfWidth;
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                widthLeft -= books[j][0];
                maxH = Math.max(maxH, books[j][1]);
                if (widthLeft >= 0) {
                    dp[i] = Math.min(dp[i], maxH + dp[j]);
                }
            }
        }
        return dp[n];
    }
}
