package g4001_4100.s4034_minimum_bishop_moves_to_reach_target;

// #Medium #Array #Math #Senior #Biweekly_Contest_190
// #2026_11_25_Time_1_ms_(96.38%)_Space_43.66_MB_(75.36%)

public class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int r1 = source[0];
        int c1 = source[1];
        int r2 = target[0];
        int c2 = target[1];
        if (r1 == r2 && c1 == c2) {
            return 0;
        }
        if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) {
            return 1;
        }
        if ((r1 + c1) % 2 != (r2 + c2) % 2) {
            return -1;
        }
        return 2;
    }
}
