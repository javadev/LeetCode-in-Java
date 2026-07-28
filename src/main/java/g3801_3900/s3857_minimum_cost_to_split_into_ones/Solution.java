package g3801_3900.s3857_minimum_cost_to_split_into_ones;

// #Medium #Dynamic_Programming #Math #Senior #Weekly_Contest_491
// #2026_07_27_Time_0_ms_(100.00%)_Space_42.09_MB_(96.12%)

public class Solution {
    public int minCost(int n) {
        return n * (n - 1) / 2;
    }
}
