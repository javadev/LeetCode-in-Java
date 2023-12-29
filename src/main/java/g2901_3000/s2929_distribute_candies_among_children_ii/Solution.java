package g2901_3000.s2929_distribute_candies_among_children_ii;

// #Medium #Math #Enumeration #Combinatorics #2023_12_29_Time_0_ms_(100.00%)_Space_40.7_MB_(5.70%)

public class Solution {
    public long distributeCandies(long n, long k) {
        if (n <= k) {
            return (n + 1) * (n + 2) / 2;
        }
        if (n <= 2 * k) {
            return (k + 1) * (k + 1)
                    - (n - k) * (n - k + 1) / 2
                    - (2 * k - n) * (2 * k - n + 1) / 2;
        }
        if (n <= 3 * k) {
            return (3 * k - n + 1) * (3 * k - n + 2) / 2;
        }
        return 0;
    }
}
