package g0501_0600.s0506_relative_ranks;

// #Easy #Array #Sorting #Heap_Priority_Queue #2022_07_24_Time_11_ms_(72.65%)_Space_53_MB_(80.23%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] tmp = new int[nums.length];
        System.arraycopy(nums, 0, tmp, 0, nums.length);
        Arrays.sort(tmp);
        Map<Integer, String> rankMap = new HashMap<>();
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                rankMap.put(tmp[i], "Gold Medal");
            } else if (i == len - 2) {
                rankMap.put(tmp[i], "Silver Medal");
            } else if (i == len - 3) {
                rankMap.put(tmp[i], "Bronze Medal");
            } else {
                rankMap.put(tmp[i], String.valueOf(len - i));
            }
        }
        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            result[i] = rankMap.get(nums[i]);
        }
        return result;
    }
}
