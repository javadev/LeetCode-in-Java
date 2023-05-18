package g2401_2500.s2447_number_of_subarrays_with_gcd_equal_to_k;

// #Medium #Array #Math #Number_Theory #2022_12_14_Time_7_ms_(96.60%)_Space_41.9_MB_(82.89%)

public class Solution {
    private int sol(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sol(b, a % b);
    }

    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int gcd = 0;
            for (int j = i; j < n; j++) {
                gcd = sol(gcd, nums[j]);
                if (gcd == k) {
                    cnt++;
                }
                if (gcd < k) {
                    break;
                }
            }
        }
        return cnt;
    }
}
