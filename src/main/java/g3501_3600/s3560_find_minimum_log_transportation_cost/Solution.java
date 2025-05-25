package g3501_3600.s3560_find_minimum_log_transportation_cost;

// #Easy #2025_05_25_Time_0_ms_(100.00%)_Space_41.10_MB_(56.75%)

public class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n == 0 || m == 0 || k == 0) {
            return 0;
        }
        long ans = 0;
        if (m <= k && n <= k) {
            return 0;
        }
        if (m > k && n <= k) {
            ans += (long) (m - k) * k;
        }
        if (n > k && m <= k) {
            ans += (long) (n - k) * k;
        }
        return ans;
    }
}
