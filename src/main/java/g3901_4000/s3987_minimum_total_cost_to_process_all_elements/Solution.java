package g3901_4000.s3987_minimum_total_cost_to_process_all_elements;

// #Medium #Array #Math #Simulation #Senior #Weekly_Contest_510
// #2026_11_03_Time_2_ms_(94.04%)_Space_136.23_MB_(77.48%)

public class Solution {
    public int minimumCost(int[] nums, int k) {
        long sum = 0L;
        int mod = 1000000007;
        for (int num : nums) {
            sum = sum + num;
        }
        if (sum < k) {
            return 0;
        }
        long kRequired;
        if (sum % k == 0) {
            kRequired = sum / k;
        } else {
            kRequired = sum / k + 1;
        }
        return (int) func(kRequired - 1, mod);
    }

    private long func(long n, int mod) {
        long ans = ((n % mod) * ((n + 1) % mod)) % mod;
        ans = (ans * 500000004) % mod;
        return ans;
    }
}
