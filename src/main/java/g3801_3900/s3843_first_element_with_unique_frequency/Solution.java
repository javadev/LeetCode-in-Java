package g3801_3900.s3843_first_element_with_unique_frequency;

// #Medium #Array #Hash_Table #Counting #Senior #Weekly_Contest_489
// #2026_07_22_Time_96_ms_(93.48%)_Space_213.96_MB_(84.60%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> c1 = new HashMap<>();
        for (int a : nums) {
            c1.put(a, c1.getOrDefault(a, 0) + 1);
        }
        Map<Integer, Integer> c2 = new HashMap<>();
        for (int f : c1.values()) {
            c2.put(f, c2.getOrDefault(f, 0) + 1);
        }
        for (int a : nums) {
            if (c2.get(c1.get(a)) == 1) {
                return a;
            }
        }
        return -1;
    }
}
