package g4001_4100.s4008_minimum_initial_strength_to_defeat_all_monsters;

// #Medium #Array #Greedy #Binary_Search #Prefix_Sum #Staff #Biweekly_Contest_188
// #2026_11_17_Time_3_ms_(97.92%)_Space_161.18_MB_(66.67%)

public class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;
        long[] diff = new long[n];
        for (int[] boost : boosts) {
            int l = boost[0];
            int r = boost[1];
            int v = boost[2];
            diff[r] += v;
            if (l > 0) {
                diff[l - 1] -= v;
            }
        }
        long res = 0;
        long bonus = 0;
        for (int i = n - 1; i >= 0; i--) {
            bonus += diff[i];
            if (res > 0) {
                res += monsters[i];
            } else {
                res = Math.max(0L, monsters[i] - bonus);
            }
        }
        return res;
    }
}
