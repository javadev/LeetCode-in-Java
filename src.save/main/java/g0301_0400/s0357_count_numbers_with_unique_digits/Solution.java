package g0301_0400.s0357_count_numbers_with_unique_digits;

// #Medium #Dynamic_Programming #Math #Backtracking
// #2022_03_15_Time_0_ms_(100.00%)_Space_39_MB_(73.67%)

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            int mul = 1;
            for (int j = 1; j < i; j++) {
                mul *= (10 - j);
            }
            ans = ans + 9 * mul;
        }
        return ans;
    }
}
