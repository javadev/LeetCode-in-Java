package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal;

// #Hard #2024_12_15_Time_56_ms_(100.00%)_Space_44.8_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int makeStringGood(String s) {
        int n = s.length();
        int[] a = new int[110];
        for (char ch : s.toCharArray()) {
            a[ch - 'a' + 1]++;
        }
        int[][] f = new int[30][3];
        int inf = Integer.MAX_VALUE / 2;
        int ans = inf;
        for (int avg = 1; avg <= n; avg++) {
            for (int[] row : f) {
                Arrays.fill(row, inf);
            }
            f[0][0] = 0;
            for (int i = 1; i <= 26; i++) {
                f[i][0] = Math.min(Math.min(f[i - 1][0], f[i - 1][1]), f[i - 1][2]) + a[i];
                if (a[i] <= avg) {
                    f[i][1] =
                            Math.min(
                                    Math.min(
                                            f[i - 1][0] + Math.max(avg - a[i - 1] - a[i], 0),
                                            f[i - 1][1] + (avg - a[i])),
                                    f[i - 1][2] + Math.max(avg - (a[i - 1] - avg) - a[i], 0));
                }
                if (a[i] >= avg) {
                    f[i][2] =
                            Math.min(Math.min(f[i - 1][0], f[i - 1][1]), f[i - 1][2])
                                    + (a[i] - avg);
                }
            }
            ans = Math.min(ans, Math.min(f[26][0], Math.min(f[26][1], f[26][2])));
        }
        return ans == inf ? -1 : ans;
    }
}
