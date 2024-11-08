package g3001_3100.s3001_minimum_moves_to_capture_the_queen;

// #Medium #Array #Enumeration #2024_11_08_Time_0_ms_(100.00%)_Space_41_MB_(27.27%)

public class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e || b == f) {
            if (a == e && a == c && (d - b) * (d - f) < 0) {
                return 2;
            }
            if (b == f && b == d && (c - a) * (c - e) < 0) {
                return 2;
            }
            return 1;
        }
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (Math.abs(c - a) == Math.abs(d - b) && (b - f) * (b - d) < 0) {
                return 2;
            }
            return 1;
        }
        return 2;
    }
}
