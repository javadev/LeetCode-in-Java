package g3801_3900.s3811_number_of_alternating_xor_partitions;

// #Medium #Array #Hash_Table #Dynamic_Programming #Bit_Manipulation #Staff #Biweekly_Contest_174
// #2026_06_09_Time_5_ms_(100.00%)_Space_93.31_MB_(44.19%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;

    public int alternatingXOR(int[] nums, int target1, int target2) {
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;
        int combXor = target1 ^ target2;
        int runningXor = 0;
        int ans;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            runningXor ^= num;
            ans = 0;
            if (runningXor == target1) {
                ans = t4 + 1;
            }
            if (runningXor == combXor) {
                ans += t1;
            }
            if (runningXor == target2) {
                ans += t2;
            }
            if (runningXor == 0) {
                ans += t3;
            }
            int ct1 = t1;
            int ct2 = t2;
            int ct3 = t3;
            int ct4 = t4;
            if (runningXor == target1) {
                ct1 += t4 + 1;
                ct1 %= MOD;
            }
            if (runningXor == combXor) {
                ct2 += t1;
                ct2 %= MOD;
            }
            if (runningXor == target2) {
                ct3 += t2;
                ct3 %= MOD;
            }
            if (runningXor == 0) {
                ct4 += t3;
                ct4 %= MOD;
            }
            t1 = ct1;
            t2 = ct2;
            t3 = ct3;
            t4 = ct4;
            if (i == n - 1) {
                return ans % MOD;
            }
        }
        return 0;
    }
}
