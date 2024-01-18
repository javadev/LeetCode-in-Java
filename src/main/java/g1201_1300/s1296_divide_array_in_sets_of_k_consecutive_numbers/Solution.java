package g1201_1300.s1296_divide_array_in_sets_of_k_consecutive_numbers;

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2022_03_12_Time_39_ms_(97.80%)_Space_55.3_MB_(85.50%)

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 0) {
                continue;
            }
            for (int v = num; v < num + k; v++) {
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
