package g3901_4000.s3940_limit_occurrences_in_sorted_array;

// #Easy #Array #Two_Pointers #Mid_Level #Weekly_Contest_503
// #2026_09_29_Time_1_ms_(100.00%)_Space_46.77_MB_(68.82%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        int freq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1;
            }
            if (freq <= k) {
                ls.add(nums[i]);
            }
        }
        int[] ans = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }
        return ans;
    }
}
