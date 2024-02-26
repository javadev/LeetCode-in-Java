package g3001_3100.s3002_maximum_size_of_a_set_after_removals;

// #Medium #Array #Hash_Table #Greedy #2024_02_26_Time_26_ms_(94.01%)_Space_53.3_MB_(80.90%)

import java.util.HashSet;

public class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        HashSet<Integer> uniq1 = new HashSet<>();
        HashSet<Integer> uniq2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            uniq1.add(nums1[i]);
            uniq2.add(nums2[i]);
        }
        int common = 0;
        if (uniq1.size() <= uniq2.size()) {
            for (int u : uniq1) {
                if (uniq2.contains(u)) {
                    common++;
                }
            }
        } else {
            for (int u : uniq2) {
                if (uniq1.contains(u)) {
                    common++;
                }
            }
        }
        int half = nums1.length / 2;
        int from1 = Math.min(uniq1.size() - common, half);
        int from2 = Math.min(uniq2.size() - common, half);
        int takeFromCommon1 = half - from1;
        int takeFromCommon2 = half - from2;
        return from1 + from2 + Math.min(takeFromCommon1 + takeFromCommon2, common);
    }
}
