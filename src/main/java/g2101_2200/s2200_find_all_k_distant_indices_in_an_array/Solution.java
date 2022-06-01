package g2101_2200.s2200_find_all_k_distant_indices_in_an_array;

// #Easy #Array #2022_06_01_Time_2_ms_(95.30%)_Space_45.9_MB_(61.88%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                start = Math.max(i - k, start);
                int end = Math.min(i + k, n - 1);
                while (start <= end) {
                    ans.add(start++);
                }
            }
        }
        return ans;
    }
}
