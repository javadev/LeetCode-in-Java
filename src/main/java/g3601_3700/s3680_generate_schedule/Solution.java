package g3601_3700.s3680_generate_schedule;

// #Medium #Array #Math #Greedy #Biweekly_Contest_165
// #2025_09_26_Time_2_ms_(100.00%)_Space_45.58_MB_(29.48%)

public class Solution {
    public int[][] generateSchedule(int n) {
        if (n < 5) {
            return new int[0][];
        }
        int[][] res = new int[n * (n - 1)][];
        int idx = 0;
        for (int i = 2; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                res[idx++] = new int[] {j, (j + i) % n};
            }
        }
        for (int i = 0; i < n; i++) {
            res[idx++] = new int[] {i, (i + 1) % n};
            res[idx++] = new int[] {(i + 4) % n, (i + 3) % n};
        }
        return res;
    }
}
