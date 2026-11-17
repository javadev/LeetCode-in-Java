package g3901_4000.s3993_maximum_value_of_an_alternating_sequence;

// #Medium #Math #Greedy #Senior #Biweekly_Contest_187
// #2026_11_17_Time_1_ms_(96.70%)_Space_42.16_MB_(87.91%)

public class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) {
            return s;
        }
        return (long) s + (long) (n / 2) * (m - 1) + 1;
    }
}
