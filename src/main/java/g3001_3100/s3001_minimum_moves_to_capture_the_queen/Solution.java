package g3001_3100.s3001_minimum_moves_to_capture_the_queen;

// #Medium #Array #Enumeration #2024_02_25_Time_0_ms_(100.00%)_Space_40.7_MB_(78.00%)

public class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e || b == f) {
            if (a == c && (d > b && d < f || d > f && d < b)) {
                return 2;
            }
            if (b == d && (c > a && c < e || c > e && c < a)) {
                return 2;
            }
            return 1;
        } else if (Math.abs(c - e) == Math.abs(d - f)) {
            if (Math.abs(a - c) == Math.abs(b - d)
                    && Math.abs(e - a) == Math.abs(f - b)
                    && (a > e && a < c || a > c && a < e)) {
                return 2;
            }
            return 1;
        }
        return 2;
    }
}
