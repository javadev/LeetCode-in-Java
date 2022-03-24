package g0801_0900.s0829_consecutive_numbers_sum;

// #Hard #Math #Enumeration #2022_03_24_Time_3_ms_(93.37%)_Space_41.1_MB_(38.00%)

public class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i > 0) {
                continue;
            }
            int j = n / i;
            if (i % 2 == 1) {
                ans++;
            }
            if (j != i && j % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }
}
