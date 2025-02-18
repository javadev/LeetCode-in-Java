package g3401_3500.s3453_separate_squares_i;

// #Medium #Array #Binary_Search #2025_02_18_Time_60_ms_(99.96%)_Space_88.58_MB_(26.92%)

public class Solution {
    public double separateSquares(int[][] squares) {
        long hi = 0L;
        long lo = 1_000_000_000L;
        for (int[] q : squares) {
            lo = Math.min(lo, q[1]);
            hi = Math.max(hi, q[1] + (long) q[2]);
        }
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (diff(mid, squares) <= 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        double diff1 = diff(hi, squares);
        double diff2 = diff(lo, squares);
        return hi + diff1 / (diff1 - diff2);
    }

    private double diff(long mid, int[][] squares) {
        double[] res = new double[2];
        for (int[] q : squares) {
            res[0] += Math.min(q[2], Math.max(0, mid - q[1])) * q[2];
            res[1] += Math.min(q[2], Math.max(0, q[1] + q[2] - mid)) * q[2];
        }
        return res[1] - res[0];
    }
}
