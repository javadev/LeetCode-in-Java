package g3101_3200.s3193_count_the_number_of_inversions;

// #Hard #Array #Dynamic_Programming #2024_06_26_Time_11_ms_(96.54%)_Space_45.5_MB_(37.54%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] r) {
        Arrays.sort(r, (o1, o2) -> o1[0] - o2[0]);
        if (r[0][0] == 0 && r[0][1] > 0) {
            return 0;
        }
        int ri = r[0][0] == 0 ? 1 : 0;
        long a = 1;
        long t;
        int[][] m = new int[n][401];
        m[0][0] = 1;
        for (int i = 1; i < m.length; i++) {
            m[i][0] = m[i - 1][0];
            for (int j = 1; j <= i; j++) {
                m[i][j] = (m[i][j] + m[i][j - 1]) % MOD;
                m[i][j] = (m[i][j] + m[i - 1][j]) % MOD;
            }
            for (int j = i + 1; j <= r[ri][1]; j++) {
                m[i][j] = (m[i][j] + m[i][j - 1]) % MOD;
                m[i][j] = (m[i][j] + m[i - 1][j]) % MOD;
                m[i][j] = (m[i][j] - m[i - 1][j - i - 1]);
                if (m[i][j] < 0) {
                    m[i][j] += MOD;
                }
            }
            if (r[ri][0] == i) {
                t = m[i][r[ri][1]];
                if (t == 0) {
                    return 0;
                }
                Arrays.fill(m[i], 0);
                m[i][r[ri][1]] = 1;
                a = (a * t) % MOD;
                ri++;
            }
        }
        return (int) a;
    }
}
