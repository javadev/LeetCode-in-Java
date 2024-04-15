package g2801_2900.s2845_count_of_interesting_subarrays;

// #Medium #Array #Hash_Table #Prefix_Sum #2023_12_13_Time_27_ms_(97.76%)_Space_62.7_MB_(26.12%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int prefixCnt = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        long interestingSubarrays = 0;
        for (Integer num : nums) {
            if (num % modulo == k) {
                prefixCnt++;
            }
            int expectedPrefix = (prefixCnt - k + modulo) % modulo;
            interestingSubarrays += freq.getOrDefault(expectedPrefix, 0);
            freq.put(prefixCnt % modulo, freq.getOrDefault(prefixCnt % modulo, 0) + 1);
        }
        return interestingSubarrays;
    }
}
