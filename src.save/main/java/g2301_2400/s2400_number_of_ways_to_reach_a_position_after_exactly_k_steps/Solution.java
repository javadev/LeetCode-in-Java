package g2301_2400.s2400_number_of_ways_to_reach_a_position_after_exactly_k_steps;

// #Medium #Dynamic_Programming #Math #Combinatorics
// #2022_09_19_Time_1_ms_(99.66%)_Space_41.7_MB_(91.83%)

public class Solution {
    private int mod = 1000000007;

    public int numberOfWays(int startPos, int endPos, int k) {
        if (Math.abs(endPos - startPos) > k) {
            return 0;
        }
        if (Math.abs(endPos - startPos + k) % 2 != 0) {
            return 0;
        }
        int t = endPos - startPos;
        int right = (k + t) / 2;
        int min = Math.min(right, k - right);
        if (min == 0) {
            return 1;
        }
        int[] rev = new int[min + 1];
        rev[1] = 1;
        int ans = k;
        for (int i = 2; i <= min; i++) {
            rev[i] = (int) ((long) (mod - mod / i) * (long) rev[mod % i] % mod);
            ans = (int) ((long) ans * (long) (k - i + 1) % mod);
            ans = (int) ((long) ans * (long) rev[i] % mod);
        }
        return ans;
    }
}
