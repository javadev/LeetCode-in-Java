package g3401_3500.s3471_find_the_largest_almost_missing_integer;

// #Easy #2025_03_02_Time_4_ms_(100.00%)_Space_44.26_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int key : set) {
                freq[key]++;
            }
        }
        for (int i = 50; i >= 0; i--) {
            if (freq[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
