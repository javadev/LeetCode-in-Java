package g2801_2900.s2894_divisible_and_non_divisible_sums_difference;

// #Easy #Math #2023_12_25_Time_1_ms_(92.30%)_Space_40.7_MB_(7.01%)

public class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }
}
