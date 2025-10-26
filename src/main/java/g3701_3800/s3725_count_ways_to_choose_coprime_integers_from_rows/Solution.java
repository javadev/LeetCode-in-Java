package g3701_3800.s3725_count_ways_to_choose_coprime_integers_from_rows;

// #Hard #Biweekly_Contest_168 #2025_10_26_Time_31_ms_(92.56%)_Space_49.21_MB_(_%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countCoprime(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int maxVal = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                maxVal = Math.max(maxVal, ints[j]);
            }
        }
        Map<Integer, Long> gcdWays = new HashMap<>();
        for (int g = maxVal; g >= 1; g--) {
            long ways = countWaysWithDivisor(mat, g, m, n);
            if (ways > 0) {
                for (int multiple = 2 * g; multiple <= maxVal; multiple += g) {
                    if (gcdWays.containsKey(multiple)) {
                        ways = (ways - gcdWays.get(multiple) + MOD) % MOD;
                    }
                }
                gcdWays.put(g, ways);
            }
        }
        return gcdWays.getOrDefault(1, 0L).intValue();
    }

    private long countWaysWithDivisor(int[][] matrix, int divisor, int rows, int cols) {
        long totalWays = 1;
        for (int row = 0; row < rows; row++) {
            int validChoices = 0;
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] % divisor == 0) {
                    validChoices++;
                }
            }
            if (validChoices == 0) {
                return 0;
            }
            totalWays = (totalWays * validChoices) % MOD;
        }
        return totalWays;
    }
}
