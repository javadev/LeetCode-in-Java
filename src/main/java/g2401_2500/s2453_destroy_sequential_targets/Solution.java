package g2401_2500.s2453_destroy_sequential_targets;

// #Medium #Array #Hash_Table #Counting #2022_12_15_Time_33_ms_(96.27%)_Space_58.9_MB_(95.38%)

import java.util.HashMap;

public class Solution {
    public int destroyTargets(int[] nums, int space) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int reminder = num % space;
            int freq = map.getOrDefault(reminder, 0);
            map.put(reminder, freq + 1);
        }
        int maxCount = 0;
        int ans = Integer.MAX_VALUE;
        for (int count : map.values()) {
            maxCount = Math.max(count, maxCount);
        }
        for (int val : nums) {
            if (map.get(val % space) == maxCount) {
                ans = Math.min(ans, val);
            }
        }
        return ans;
    }
}
