package g2301_2400.s2364_count_number_of_bad_pairs;

// #Medium #Array #Hash_Table #2022_08_14_Time_44_ms_(80.00%)_Space_55.3_MB_(100.00%)

import java.util.HashMap;

public class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = i - nums[i];
            if (seen.containsKey(diff)) {
                count += (i - seen.get(diff));
            } else {
                count += i;
            }
            seen.put(diff, seen.getOrDefault(diff, 0) + 1);
        }
        return count;
    }
}
