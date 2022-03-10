package g1201_1300.s1296_divide_array_in_sets_of_k_consecutive_numbers;

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2022_03_10_Time_70_ms_(89.13%)_Space_79.4_MB_(33.93%)

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) == 0) {
                continue;
            }
            for (int v = nums[i]; v < nums[i] + k; v++) {
                if (!map.containsKey(v) || map.get(v) == 0) {
                    return false;
                } else {
                    map.put(v, map.get(v) - 1);
                }
            }
        }
        return true;
    }
}
