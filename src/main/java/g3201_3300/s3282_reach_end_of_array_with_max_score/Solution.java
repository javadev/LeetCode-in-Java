package g3201_3300.s3282_reach_end_of_array_with_max_score;

// #Medium #Array #Greedy #2024_09_09_Time_9_ms_(100.00%)_Space_63.2_MB_(100.00%)

import java.util.List;

public class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long res = 0;
        long ma = 0;
        for (int num : nums) {
            res += ma;
            ma = Math.max(ma, num);
        }
        return res;
    }
}
