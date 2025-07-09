package g3101_3200.s3164_find_the_number_of_good_pairs_ii;

// #Medium #Array #Hash_Table #2024_06_02_Time_407_ms_(75.28%)_Space_66.8_MB_(7.30%)

import java.util.HashMap;

public class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long ans = 0;
        for (int val : nums2) {
            hm.put(val * k, hm.getOrDefault(val * k, 0) + 1);
        }
        for (int i : nums1) {
            if (i % k != 0) {
                continue;
            }
            for (int factor = 1; factor * factor <= i; factor++) {
                if (i % factor != 0) {
                    continue;
                }
                int factor2 = i / factor;
                if (hm.containsKey(factor)) {
                    ans += hm.get(factor);
                }
                if (factor != factor2 && hm.containsKey(factor2)) {
                    ans += hm.get(factor2);
                }
            }
        }
        return ans;
    }
}
