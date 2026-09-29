package g3901_4000.s3932_count_k_th_roots_in_a_range;

// #Medium #Math #Binary_Search #Senior #Weekly_Contest_502
// #2026_09_29_Time_1_ms_(100.00%)_Space_42.94_MB_(7.52%)

public class Solution {
    public int countKthRoots(int l, int r, int k) {
        if (k == 1) {
            return r - l + 1;
        }
        int ans = 0;
        int start = 0;
        int pow = (int) Math.pow(start, k);
        while (l > pow) {
            start++;
            pow = (int) Math.pow(start, k);
        }
        while (pow <= r) {
            start++;
            pow = (int) Math.pow(start, k);
            ans++;
        }
        return ans;
    }
}
