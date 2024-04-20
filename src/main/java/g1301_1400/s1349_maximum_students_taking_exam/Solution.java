package g1301_1400.s1349_maximum_students_taking_exam;

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
// #2022_03_21_Time_4_ms_(76.98%)_Space_42.4_MB_(28.06%)

import java.util.Arrays;

public class Solution {
    public int maxStudents(char[][] seats) {
        int m = seats.length;
        int n = seats[0].length;
        int[] validRows = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                validRows[i] = (validRows[i] << 1) + (seats[i][j] == '.' ? 1 : 0);
            }
        }
        int stateSize = 1 << n;
        int[][] dp = new int[m][stateSize];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < stateSize; j++) {
                if (((j & validRows[i]) == j) && ((j & (j << 1)) == 0)) {
                    if (i == 0) {
                        dp[i][j] = Integer.bitCount(j);
                    } else {
                        for (int k = 0; k < stateSize; k++) {
                            if (((k << 1) & j) == 0 && ((j << 1) & k) == 0 && dp[i - 1][k] != -1) {
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + Integer.bitCount(j));
                            }
                        }
                    }
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}
