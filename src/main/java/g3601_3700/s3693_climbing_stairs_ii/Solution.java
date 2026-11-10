package g3601_3700.s3693_climbing_stairs_ii;

// #Medium #Array #Dynamic_Programming #Biweekly_Contest_166
// #2026_11_10_Time_3_ms_(97.54%)_Space_110.15_MB_(92.77%)

@SuppressWarnings({"unused", "java:S1172"})
public class Solution {
    public int climbStairs(int n, int[] costs) {
        if (costs.length == 1) {
            return costs[0] + 1;
        }
        int one = costs[0] + 1;
        int two = Math.min(one + costs[1] + 1, costs[1] + 4);
        if (costs.length < 3) {
            return two;
        }
        int three = Math.min(one + costs[2] + 4, Math.min(two + costs[2] + 1, costs[2] + 9));
        if (costs.length < 4) {
            return three;
        }
        for (int i = 3; i < costs.length; i++) {
            int four =
                    (Math.min(
                            three + costs[i] + 1,
                            Math.min(two + costs[i] + 4, one + costs[i] + 9)));
            one = two;
            two = three;
            three = four;
        }
        return three;
    }
}
