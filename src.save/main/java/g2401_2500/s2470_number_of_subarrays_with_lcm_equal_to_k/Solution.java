package g2401_2500.s2470_number_of_subarrays_with_lcm_equal_to_k;

// #Medium #Array #Math #Number_Theory #2023_01_24_Time_23_ms_(62.35%)_Space_41.9_MB_(63.16%)

public class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int lcm = nums[i];
            for (int j = i; j < nums.length; j++) {
                lcm = (lcm * nums[j]) / (gcd(lcm, nums[j]));
                if (lcm == k) {
                    ans++;
                }
                if (k % lcm != 0) {
                    break;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
