package g3701_3800.s3752_lexicographically_smallest_negated_permutation_that_sums_to_target;

// #Medium #Array #Math #Sorting #Greedy #Two_Pointers #Staff #Biweekly_Contest_170
// #2026_04_26_Time_3_ms_(100.00%)_Space_162.22_MB_(86.17%)

public class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long drop = (long) n * (n + 1) / 2 - target;
        if (drop < 0 || drop % 2 != 0) {
            return new int[] {};
        }
        int[] ans = new int[n];
        int l = 0;
        int r = n - 1;
        for (int i = n; i > 0; i--) {
            int val = i;
            if (2 * val <= drop) {
                drop -= 2 * val;
                ans[l++] = -val;
            } else {
                ans[r--] = val;
            }
        }
        if (drop != 0) {
            return new int[] {};
        }
        return ans;
    }
}
