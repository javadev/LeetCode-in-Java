package g3401_3500.s3449_maximize_the_minimum_game_score;

// #Hard #Array #Greedy #Binary_Search #2025_02_11_Time_188_ms_(100.00%)_Space_52.73_MB_(92.19%)

public class Solution {
    private boolean judge(int[] points, long m, long tgt) {
        long cur = 0L;
        long nxt = 0L;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 && nxt >= tgt) {
                return true;
            }
            m--;
            cur = nxt + points[i];
            nxt = 0;
            if (cur < tgt) {
                long req = (tgt - cur - 1) / points[i] + 1;
                if (i < n - 1) {
                    nxt = points[i + 1] * req;
                }
                m -= req * 2;
            }
            if (m < 0) {
                return false;
            }
        }
        return true;
    }

    public long maxScore(int[] points, int m) {
        long x = 0L;
        long y = 10000000L * m;
        while (x < y - 1) {
            long mid = (x + y) / 2;
            if (judge(points, m, mid)) {
                x = mid;
            } else {
                y = mid - 1;
            }
        }
        while (judge(points, m, x + 1)) {
            x++;
        }
        return x;
    }
}
