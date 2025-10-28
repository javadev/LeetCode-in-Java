package g3701_3800.s3727_maximum_alternating_sum_of_squares;

// #Medium #Weekly_Contest_473 #2025_10_28_Time_10_ms_(99.97%)_Space_63.08_MB_(17.57%)

public class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int need = n / 2;
        int maxa = 40000;
        int[] freq = new int[maxa + 1];
        long total = 0;
        for (int x : nums) {
            int a = Math.abs(x);
            freq[a]++;
            total += 1L * a * a;
        }
        long small = 0;
        for (int a = 0; a <= maxa && need > 0; a++) {
            int take = Math.min(freq[a], need);
            if (take > 0) {
                small += 1L * a * a * take;
                need -= take;
            }
        }
        return total - 2 * small;
    }
}
