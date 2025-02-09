package g3401_3500.s3449_maximize_the_minimum_game_score;

// #Hard #2025_02_09_Time_278_(100.00%)_Space_54.25_(100.00%)

public class Solution {
    public long maxScore(int[] points, int m) {
        int n = points.length;
        if (m < n) {
            return 0;
        }
        long lo = 1;
        long hi = (long) 1e18;
        long ans = 0;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long tot = 0;
            long tr = 0;
            long skip = 0;
            for (int i = 0; i < n && tot <= m; i++) {
                int p = points[i];
                long need = (mid + p - 1L) / p;
                if (tr >= need) {
                    tr = 0;
                    skip++;
                } else {
                    long cur = tr * (long) p;
                    long ops = (mid - cur + p - 1L) / p;
                    tot += 2 * ops - 1 + skip;
                    tr = Math.max(ops - 1, 0);
                    skip = 0;
                }
            }
            if (tot <= m) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
