package g0401_0500.s0477_total_hamming_distance;

// #Medium #Array #Math #Bit_Manipulation #Acceptance_52.0%
// #2022_03_18_Time_5_ms_(90.97%)_Space_53.9_MB_(55.17%)

public class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int k : nums) {
                ones += ((k >> i) & 1);
            }
            ans = ans + (ones * (n - ones));
        }
        return ans;
    }
}
