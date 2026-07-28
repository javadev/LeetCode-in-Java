package g3801_3900.s3871_count_commas_in_range_ii;

// #Medium #Math #Senior #Weekly_Contest_493 #2026_07_28_Time_1_ms_(99.11%)_Space_42.88_MB_(24.89%)

public class Solution {
    public long countCommas(long n) {
        long count = 0;
        if (n >= 1000L) {
            count += n - 999L;
        }
        if (n >= 1000000L) {
            count += n - 999999L;
        }
        if (n >= 1000000000L) {
            count += n - 999999999L;
        }
        if (n >= 1000000000000L) {
            count += n - 999999999999L;
        }
        if (n >= 1000000000000000L) {
            count += n - 999999999999999L;
        }
        return count;
    }
}
