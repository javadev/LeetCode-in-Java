package g3701_3800.s3782_last_remaining_integer_after_alternating_deletion_operations;

// #Hard #Math #Recursion #Senior_Staff #Biweekly_Contest_172
// #2026_05_06_Time_1_ms_(100.00%)_Space_43.05_MB_(9.38%)

public class Solution {
    public long lastInteger(long n) {
        final long MASK = 0xAAAAAAAAAAAAAAAL;
        return ((n - 1) & MASK) + 1;
    }
}
