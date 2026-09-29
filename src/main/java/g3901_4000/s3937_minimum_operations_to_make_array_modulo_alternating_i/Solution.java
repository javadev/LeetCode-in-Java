package g3901_4000.s3937_minimum_operations_to_make_array_modulo_alternating_i;

// #Medium #Array #Enumeration #Senior #Biweekly_Contest_183
// #2026_09_29_Time_5_ms_(98.11%)_Space_44.80_MB_(86.79%)

public class Solution {
    public int minOperations(int[] nums, int k) {
        int[] even = new int[k];
        int[] odd = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i] % k;
            for (int j = 0; j < k; j++) {
                int diff = Math.abs(rem - j);
                int cost = Math.min(diff, k - diff);
                if (i % 2 == 0) {
                    even[j] += cost;
                } else {
                    odd[j] += cost;
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int x = 0; x < k; x++) {
            for (int y = 0; y < k; y++) {
                if (x != y) {
                    ans = Math.min(ans, odd[x] + even[y]);
                }
            }
        }
        return ans;
    }
}
