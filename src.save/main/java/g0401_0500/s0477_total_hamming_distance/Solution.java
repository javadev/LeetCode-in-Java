package g0401_0500.s0477_total_hamming_distance;

// #Medium #Array #Math #Bit_Manipulation #2022_07_20_Time_5_ms_(95.10%)_Space_54.9_MB_(8.69%)

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
