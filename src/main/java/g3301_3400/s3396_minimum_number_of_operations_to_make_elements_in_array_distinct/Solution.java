package g3301_3400.s3396_minimum_number_of_operations_to_make_elements_in_array_distinct;

// #Easy #Array #Greedy #Simulation #Distinct #Elements #Operations
// #2024_12_22_Time_4_ms_(100.00%)_Space_45_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dupct = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2) {
                dupct++;
            }
        }
        int n = nums.length;
        int i = 0;
        int op = 0;
        while (dupct > 0) {
            op++;
            int limit = Math.min(n, i + 3);
            for (; i < limit; i++) {
                int val = map.get(nums[i]);
                if (val == 2) {
                    dupct--;
                }
                map.put(nums[i], val - 1);
            }
        }
        return op;
    }
}
