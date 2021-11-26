package g0201_0300.s0220_contains_duplicate_iii;

import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0 || nums.length <= 1) {
            return false;
        }
        TreeSet<Integer> kSet =
                new TreeSet<>(
                        (i1, i2) -> {
                            long diff = (long) i1 - i2;
                            if (Math.abs(diff) <= t) {
                                return 0;
                            } else {
                                return diff > 0 ? +1 : -1;
                            }
                        });

        for (int i = 0; i < nums.length; ++i) {
            if (!kSet.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                kSet.remove(nums[i - k]);
            }
        }
        return false;
    }
}
