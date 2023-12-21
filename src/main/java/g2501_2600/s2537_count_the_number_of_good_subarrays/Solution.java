package g2501_2600.s2537_count_the_number_of_good_subarrays;

// #Medium #Array #Hash_Table #Sliding_Window #2023_04_22_Time_38_ms_(99.07%)_Space_60.8_MB_(16.67%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countGood(int[] nums, int k) {
        if (nums.length < 2) {
            return 0L;
        }
        Map<Integer, Integer> countMap = new HashMap<>(nums.length, 0.99f);
        long goodSubArrays = 0L;
        long current = 0L;
        int left = 0;
        int right = -1;
        while (left < nums.length) {
            if (current < k) {
                if (++right == nums.length) {
                    break;
                }
                Integer num = nums[right];
                Integer count = countMap.get(num);
                if (count == null) {
                    count = 1;
                } else {
                    current += count;
                    if (current >= k) {
                        goodSubArrays += nums.length - right;
                    }
                    count = count + 1;
                }
                countMap.put(num, count);
            } else {
                Integer num = nums[left++];
                int count = countMap.get(num) - 1;
                if (count > 0) {
                    countMap.put(num, count);
                    current -= count;
                } else {
                    countMap.remove(num);
                }
                if (current >= k) {
                    goodSubArrays += nums.length - right;
                }
            }
        }
        return goodSubArrays;
    }
}
