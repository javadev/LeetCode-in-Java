package g3701_3800.s3727_maximum_alternating_sum_of_squares;

// #Medium #Array #Sorting #Greedy #Weekly_Contest_473
// #2025_10_29_Time_9_ms_(100.00%)_Space_62.45_MB_(32.41%)

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
