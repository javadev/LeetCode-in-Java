package g2301_2400.s2342_max_sum_of_a_pair_with_equal_sum_of_digits;

// #Medium #Array #Hash_Table #Sorting #Heap_Priority_Queue
// #2022_07_18_Time_99_ms_(100.00%)_Space_121.2_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int num : nums) {
            int s = 0;
            for (char digit : String.valueOf(num).toCharArray()) {
                s += Integer.valueOf(digit - '0');
            }
            if (!map.containsKey(s)) {
                map.put(s, num);
            } else {
                res = Math.max(res, map.get(s) + num);
                map.put(s, Math.max(map.get(s), num));
            }
        }
        return res;
    }
}
