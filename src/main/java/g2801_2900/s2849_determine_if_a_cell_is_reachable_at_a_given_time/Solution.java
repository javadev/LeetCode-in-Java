package g2801_2900.s2849_determine_if_a_cell_is_reachable_at_a_given_time;

// #Medium #Math #2023_12_15_Time_1_ms_(91.15%)_Space_39.3_MB_(87.43%)

public class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy) {
            return t != 1;
        }
        int width = Math.abs(sx - fx) + 1;
        int height = Math.abs(sy - fy) + 1;
        return Math.max(width, height) - 1 <= t;
    }
}
